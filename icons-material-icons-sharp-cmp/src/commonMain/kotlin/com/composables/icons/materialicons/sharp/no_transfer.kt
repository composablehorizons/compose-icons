package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.No_transfer: ImageVector
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
                moveTo(19.78f, 22.61f)
                lineTo(18.17f, 21f)
                horizontalLineTo(16f)
                verticalLineToRelative(-2f)
                horizontalLineTo(8f)
                verticalLineToRelative(2f)
                horizontalLineTo(5f)
                verticalLineToRelative(-2.78f)
                curveTo(4.39f, 17.67f, 4f, 16.88f, 4f, 16f)
                verticalLineTo(6.83f)
                lineTo(1.39f, 4.22f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(18.38f, 18.38f)
                lineTo(19.78f, 22.61f)
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

