package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Commute: ImageVector
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
                lineToRelative(-1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                lineToRelative(2f, -2.03f)
                lineTo(9f, 18f)
                verticalLineToRelative(-5f)
                horizontalLineTo(4f)
                verticalLineTo(5.98f)
                lineTo(13f, 6f)
                verticalLineToRelative(2f)
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
                lineTo(10f, 13.77f)
                lineToRelative(0.01f, 5.51f)
                curveToRelative(0f, 0.38f, 0.31f, 0.72f, 0.69f, 0.72f)
                horizontalLineToRelative(0.62f)
                curveToRelative(0.38f, 0f, 0.68f, -0.38f, 0.68f, -0.76f)
                verticalLineTo(18f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1.24f)
                curveToRelative(0f, 0.38f, 0.31f, 0.76f, 0.69f, 0.76f)
                horizontalLineToRelative(0.61f)
                curveToRelative(0.38f, 0f, 0.69f, -0.34f, 0.69f, -0.72f)
                lineToRelative(0.01f, -1.37f)
                verticalLineToRelative(-4.14f)
                lineToRelative(-1.43f, -4.11f)
                close()
                moveToRelative(-8.16f, 0.34f)
                horizontalLineToRelative(7.19f)
                lineToRelative(1.03f, 3f)
                horizontalLineToRelative(-9.25f)
                lineToRelative(1.03f, -3f)
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

