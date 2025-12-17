package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Commute: ImageVector
    get() {
        if (_Commute != null) return _Commute!!
        
        _Commute = ImageVector.Builder(
            name = "commute",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 4f)
                horizontalLineTo(5f)
                curveTo(3.34f, 4f, 2f, 5.34f, 2f, 7f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                lineToRelative(-0.77f, 0.77f)
                curveToRelative(-0.28f, 0.28f, -0.28f, 0.72f, 0f, 1f)
                reflectiveCurveToRelative(0.72f, 0.28f, 1f, 0f)
                lineTo(7f, 18f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                horizontalLineTo(4.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(8f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineTo(8f)
                horizontalLineToRelative(2f)
                verticalLineTo(7f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                close()
                moveTo(5f, 14f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveToRelative(15.57f, -4.34f)
                curveToRelative(-0.14f, -0.4f, -0.52f, -0.66f, -0.97f, -0.66f)
                horizontalLineToRelative(-7.19f)
                curveToRelative(-0.46f, 0f, -0.83f, 0.26f, -0.98f, 0.66f)
                lineToRelative(-1.42f, 4.11f)
                verticalLineToRelative(5.24f)
                curveToRelative(0f, 0.55f, 0.45f, 0.99f, 1f, 0.99f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(0.99f, -0.44f, 1f, -0.99f)
                lineTo(22f, 13.77f)
                lineToRelative(-1.43f, -4.11f)
                close()
                moveToRelative(-7.8f, 0.34f)
                horizontalLineToRelative(6.48f)
                curveToRelative(0.21f, 0f, 0.4f, 0.14f, 0.47f, 0.34f)
                lineToRelative(0.69f, 2f)
                curveToRelative(0.11f, 0.32f, -0.13f, 0.66f, -0.47f, 0.66f)
                horizontalLineToRelative(-7.85f)
                curveToRelative(-0.34f, 0f, -0.58f, -0.34f, -0.47f, -0.66f)
                lineToRelative(0.69f, -2f)
                curveToRelative(0.05f, -0.2f, 0.24f, -0.34f, 0.46f, -0.34f)
                close()
                moveTo(12f, 16f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveToRelative(8f, 0f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.build()
        
        return _Commute!!
    }

private var _Commute: ImageVector? = null

