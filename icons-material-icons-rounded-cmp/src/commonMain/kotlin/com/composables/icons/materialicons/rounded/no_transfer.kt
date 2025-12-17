package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.No_transfer: ImageVector
    get() {
        if (_No_transfer != null) return _No_transfer!!
        
        _No_transfer = ImageVector.Builder(
            name = "no_transfer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.78f, 2.95f)
                curveTo(7.24f, 2.16f, 9.48f, 2f, 12f, 2f)
                curveToRelative(4.42f, 0f, 8f, 0.5f, 8f, 4f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 0.35f, -0.08f, 0.67f, -0.19f, 0.98f)
                lineTo(13.83f, 11f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                horizontalLineTo(8.83f)
                lineTo(5.78f, 2.95f)
                close()
                moveTo(20.49f, 21.9f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(-1.01f, -1.01f)
                curveTo(17.89f, 20.96f, 17.7f, 21f, 17.5f, 21f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.68f, -1.5f, -1.5f)
                verticalLineTo(19f)
                horizontalLineTo(8f)
                verticalLineToRelative(0.5f)
                curveTo(8f, 20.33f, 7.33f, 21f, 6.5f, 21f)
                reflectiveCurveTo(5f, 20.33f, 5f, 19.5f)
                verticalLineToRelative(-1.28f)
                curveTo(4.39f, 17.67f, 4f, 16.88f, 4f, 16f)
                verticalLineTo(6.83f)
                lineToRelative(-1.9f, -1.9f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(16.97f, 16.97f)
                curveTo(20.88f, 20.88f, 20.88f, 21.51f, 20.49f, 21.9f)
                close()
                moveTo(9f, 15.5f)
                curveTo(9f, 14.67f, 8.33f, 14f, 7.5f, 14f)
                reflectiveCurveTo(6f, 14.67f, 6f, 15.5f)
                curveTo(6f, 16.33f, 6.67f, 17f, 7.5f, 17f)
                reflectiveCurveTo(9f, 16.33f, 9f, 15.5f)
                close()
                moveTo(8.17f, 11f)
                lineTo(6f, 8.83f)
                verticalLineTo(11f)
                horizontalLineTo(8.17f)
                close()
            }
        }.build()
        
        return _No_transfer!!
    }

private var _No_transfer: ImageVector? = null

