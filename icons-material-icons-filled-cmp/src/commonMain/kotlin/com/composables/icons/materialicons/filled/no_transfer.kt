package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.No_transfer: ImageVector
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
                moveTo(21.19f, 21.19f)
                lineTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineTo(4f, 6.83f)
                verticalLineTo(16f)
                curveToRelative(0f, 0.88f, 0.39f, 1.67f, 1f, 2.22f)
                verticalLineTo(20f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                curveToRelative(0.05f, 0f, 0.09f, -0.02f, 0.14f, -0.03f)
                lineToRelative(1.64f, 1.64f)
                lineTo(21.19f, 21.19f)
                close()
                moveTo(7.5f, 17f)
                curveTo(6.67f, 17f, 6f, 16.33f, 6f, 15.5f)
                curveTo(6f, 14.67f, 6.67f, 14f, 7.5f, 14f)
                reflectiveCurveTo(9f, 14.67f, 9f, 15.5f)
                curveTo(9f, 16.33f, 8.33f, 17f, 7.5f, 17f)
                close()
                moveTo(6f, 11f)
                verticalLineTo(8.83f)
                lineTo(8.17f, 11f)
                horizontalLineTo(6f)
                close()
                moveTo(8.83f, 6f)
                lineTo(5.78f, 2.95f)
                curveTo(7.24f, 2.16f, 9.48f, 2f, 12f, 2f)
                curveToRelative(4.42f, 0f, 8f, 0.5f, 8f, 4f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 0.35f, -0.08f, 0.67f, -0.19f, 0.98f)
                lineTo(13.83f, 11f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                horizontalLineTo(8.83f)
                close()
            }
        }.build()
        
        return _No_transfer!!
    }

private var _No_transfer: ImageVector? = null

