package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.Map: ImageVector
    get() {
        if (_Map != null) return _Map!!
        
        _Map = ImageVector.Builder(
            name = "map",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560.02f, 32f)
                curveToRelative(-1.96f, 0f, -3.98f, 0.37f, -5.96f, 1.16f)
                lineTo(384.01f, 96f)
                horizontalLineTo(384f)
                lineTo(212f, 35.28f)
                arcTo(64.252f, 64.252f, 0f, false, false, 191.76f, 32f)
                curveToRelative(-6.69f, 0f, -13.37f, 1.05f, -19.81f, 3.14f)
                lineTo(20.12f, 87.95f)
                arcTo(32.006f, 32.006f, 0f, false, false, 0f, 117.66f)
                verticalLineToRelative(346.32f)
                curveTo(0f, 473.17f, 7.53f, 480f, 15.99f, 480f)
                curveToRelative(1.96f, 0f, 3.97f, -0.37f, 5.96f, -1.16f)
                lineTo(192f, 416f)
                lineToRelative(172f, 60.71f)
                arcToRelative(63.98f, 63.98f, 0f, false, false, 40.05f, 0.15f)
                lineToRelative(151.83f, -52.81f)
                arcTo(31.996f, 31.996f, 0f, false, false, 576f, 394.34f)
                verticalLineTo(48.02f)
                curveToRelative(0f, -9.19f, -7.53f, -16.02f, -15.98f, -16.02f)
                close()
                moveTo(224f, 90.42f)
                lineToRelative(128f, 45.19f)
                verticalLineToRelative(285.97f)
                lineToRelative(-128f, -45.19f)
                verticalLineTo(90.42f)
                close()
                moveTo(48f, 418.05f)
                verticalLineTo(129.07f)
                lineToRelative(128f, -44.53f)
                verticalLineToRelative(286.2f)
                lineToRelative(-0.64f, 0.23f)
                lineTo(48f, 418.05f)
                close()
                moveToRelative(480f, -35.13f)
                lineToRelative(-128f, 44.53f)
                verticalLineTo(141.26f)
                lineToRelative(0.64f, -0.24f)
                lineTo(528f, 93.95f)
                verticalLineToRelative(288.97f)
                close()
            }
        }.build()
        
        return _Map!!
    }

private var _Map: ImageVector? = null

