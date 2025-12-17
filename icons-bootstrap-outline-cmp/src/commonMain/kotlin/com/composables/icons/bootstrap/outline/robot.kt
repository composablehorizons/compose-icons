package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Robot: ImageVector
    get() {
        if (_Robot != null) return _Robot!!
        
        _Robot = ImageVector.Builder(
            name = "robot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 12.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                moveTo(3f, 8.062f)
                curveTo(3f, 6.76f, 4.235f, 5.765f, 5.53f, 5.886f)
                arcToRelative(26.6f, 26.6f, 0f, false, false, 4.94f, 0f)
                curveTo(11.765f, 5.765f, 13f, 6.76f, 13f, 8.062f)
                verticalLineToRelative(1.157f)
                arcToRelative(0.93f, 0.93f, 0f, false, true, -0.765f, 0.935f)
                curveToRelative(-0.845f, 0.147f, -2.34f, 0.346f, -4.235f, 0.346f)
                reflectiveCurveToRelative(-3.39f, -0.2f, -4.235f, -0.346f)
                arcTo(0.93f, 0.93f, 0f, false, true, 3f, 9.219f)
                close()
                moveToRelative(4.542f, -0.827f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.217f, 0.068f)
                lineToRelative(-0.92f, 0.9f)
                arcToRelative(25f, 25f, 0f, false, true, -1.871f, -0.183f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.068f, 0.495f)
                curveToRelative(0.55f, 0.076f, 1.232f, 0.149f, 2.02f, 0.193f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0.189f, -0.071f)
                lineToRelative(0.754f, -0.736f)
                lineToRelative(0.847f, 1.71f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0.404f, 0.062f)
                lineToRelative(0.932f, -0.97f)
                arcToRelative(25f, 25f, 0f, false, false, 1.922f, -0.188f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.068f, -0.495f)
                curveToRelative(-0.538f, 0.074f, -1.207f, 0.145f, -1.98f, 0.189f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.166f, 0.076f)
                lineToRelative(-0.754f, 0.785f)
                lineToRelative(-0.842f, -1.7f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.182f, -0.135f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 1.866f)
                arcToRelative(1f, 1f, 0f, true, false, -1f, 0f)
                verticalLineTo(3f)
                horizontalLineToRelative(-2f)
                arcTo(4.5f, 4.5f, 0f, false, false, 1f, 7.5f)
                verticalLineTo(8f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                verticalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(9f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                verticalLineToRelative(-0.5f)
                arcTo(4.5f, 4.5f, 0f, false, false, 10.5f, 3f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(14f, 7.5f)
                verticalLineTo(13f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(7.5f)
                arcTo(3.5f, 3.5f, 0f, false, true, 5.5f, 4f)
                horizontalLineToRelative(5f)
                arcTo(3.5f, 3.5f, 0f, false, true, 14f, 7.5f)
            }
        }.build()
        
        return _Robot!!
    }

private var _Robot: ImageVector? = null

