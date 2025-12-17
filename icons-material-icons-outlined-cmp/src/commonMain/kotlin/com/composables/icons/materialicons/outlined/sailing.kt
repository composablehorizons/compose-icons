package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Sailing: ImageVector
    get() {
        if (_Sailing != null) return _Sailing!!
        
        _Sailing = ImageVector.Builder(
            name = "sailing",
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
                moveTo(11f, 13.5f)
                verticalLineTo(2f)
                lineTo(3f, 13.5f)
                horizontalLineTo(11f)
                close()
                moveTo(9f, 11.5f)
                horizontalLineTo(6.83f)
                lineTo(9f, 8.38f)
                verticalLineTo(11.5f)
                close()
                moveTo(21f, 13.5f)
                curveTo(21f, 6.5f, 14.5f, 1f, 12.5f, 1f)
                curveToRelative(0f, 0f, 1f, 3f, 1f, 6.5f)
                reflectiveCurveToRelative(-1f, 6f, -1f, 6f)
                horizontalLineTo(21f)
                close()
                moveTo(15.38f, 5.24f)
                curveToRelative(1.42f, 1.52f, 2.88f, 3.72f, 3.41f, 6.26f)
                horizontalLineToRelative(-3.68f)
                curveToRelative(0.21f, -1.1f, 0.39f, -2.46f, 0.39f, -4f)
                curveTo(15.5f, 6.71f, 15.45f, 5.95f, 15.38f, 5.24f)
                close()
                moveTo(22f, 15f)
                horizontalLineTo(2f)
                curveToRelative(0.31f, 1.53f, 1.16f, 2.84f, 2.33f, 3.73f)
                curveTo(4.98f, 18.46f, 5.55f, 18.01f, 6f, 17.5f)
                curveTo(6.73f, 18.34f, 7.8f, 19f, 9f, 19f)
                reflectiveCurveToRelative(2.27f, -0.66f, 3f, -1.5f)
                curveToRelative(0.73f, 0.84f, 1.8f, 1.5f, 3f, 1.5f)
                reflectiveCurveToRelative(2.26f, -0.66f, 3f, -1.5f)
                curveToRelative(0.45f, 0.51f, 1.02f, 0.96f, 1.67f, 1.23f)
                curveTo(20.84f, 17.84f, 21.69f, 16.53f, 22f, 15f)
                close()
                moveTo(22f, 23f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.04f, 0f, -2.08f, -0.35f, -3f, -1f)
                curveToRelative(-1.83f, 1.3f, -4.17f, 1.3f, -6f, 0f)
                curveToRelative(-1.83f, 1.3f, -4.17f, 1.3f, -6f, 0f)
                curveToRelative(-0.91f, 0.65f, -1.96f, 1f, -3f, 1f)
                horizontalLineTo(2f)
                lineToRelative(0f, 2f)
                horizontalLineToRelative(1f)
                curveToRelative(1.03f, 0f, 2.05f, -0.25f, 3f, -0.75f)
                curveToRelative(1.89f, 1f, 4.11f, 1f, 6f, 0f)
                curveToRelative(1.89f, 1f, 4.11f, 1f, 6f, 0f)
                horizontalLineToRelative(0f)
                curveToRelative(0.95f, 0.5f, 1.97f, 0.75f, 3f, 0.75f)
                horizontalLineTo(22f)
                close()
            }
        }.build()
        
        return _Sailing!!
    }

private var _Sailing: ImageVector? = null

