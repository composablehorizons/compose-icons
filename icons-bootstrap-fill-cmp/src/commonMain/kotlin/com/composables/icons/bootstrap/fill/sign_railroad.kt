package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.SignRailroad: ImageVector
    get() {
        if (_SignRailroad != null) return _SignRailroad!!
        
        _SignRailroad = ImageVector.Builder(
            name = "sign-railroad",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.05f, 0.435f)
                curveToRelative(-0.58f, -0.58f, -1.52f, -0.58f, -2.1f, 0f)
                lineTo(4.224f, 3.162f)
                lineTo(8f, 6.94f)
                lineToRelative(3.777f, -3.777f)
                lineTo(9.049f, 0.435f)
                close()
                moveToRelative(3.274f, 7.425f)
                verticalLineToRelative(-0.862f)
                horizontalLineToRelative(0.467f)
                curveToRelative(0.28f, 0f, 0.467f, 0.154f, 0.467f, 0.44f)
                curveToRelative(0f, 0.28f, -0.182f, 0.421f, -0.475f, 0.421f)
                horizontalLineToRelative(-0.459f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.838f, 4.223f)
                lineTo(9.06f, 8f)
                lineToRelative(3.777f, 3.777f)
                lineToRelative(2.727f, -2.728f)
                curveToRelative(0.58f, -0.58f, 0.58f, -1.519f, 0f, -2.098f)
                close()
                moveToRelative(0.03f, 2.361f)
                curveToRelative(0.591f, 0f, 0.935f, 0.334f, 0.935f, 0.844f)
                arcToRelative(0.79f, 0.79f, 0f, false, true, -0.485f, 0.748f)
                lineToRelative(0.536f, 1.074f)
                horizontalLineToRelative(-0.59f)
                lineToRelative(-0.467f, -0.994f)
                horizontalLineToRelative(-0.473f)
                verticalLineToRelative(0.994f)
                horizontalLineToRelative(-0.521f)
                verticalLineTo(6.584f)
                horizontalLineToRelative(1.064f)
                close()
                moveToRelative(-1.091f, 6.254f)
                lineTo(8f, 9.06f)
                lineToRelative(-3.777f, 3.777f)
                lineToRelative(2.728f, 2.727f)
                curveToRelative(0.58f, 0.58f, 1.519f, 0.58f, 2.098f, 0f)
                close()
                moveToRelative(-8.953f, -5.84f)
                verticalLineToRelative(0.861f)
                horizontalLineToRelative(0.46f)
                curveToRelative(0.292f, 0f, 0.474f, -0.14f, 0.474f, -0.421f)
                curveToRelative(0f, -0.286f, -0.188f, -0.44f, -0.467f, -0.44f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.162f, 11.777f)
                lineTo(6.94f, 8f)
                lineTo(3.162f, 4.223f)
                lineTo(0.435f, 6.951f)
                curveToRelative(-0.58f, 0.58f, -0.58f, 1.519f, 0f, 2.098f)
                close()
                moveToRelative(-0.86f, -5.193f)
                horizontalLineToRelative(1.065f)
                curveToRelative(0.592f, 0f, 0.936f, 0.334f, 0.936f, 0.844f)
                curveToRelative(0f, 0.39f, -0.242f, 0.654f, -0.485f, 0.748f)
                lineToRelative(0.536f, 1.074f)
                horizontalLineToRelative(-0.59f)
                lineToRelative(-0.467f, -0.994f)
                horizontalLineToRelative(-0.473f)
                verticalLineToRelative(0.994f)
                horizontalLineToRelative(-0.521f)
                verticalLineTo(6.584f)
                close()
            }
        }.build()
        
        return _SignRailroad!!
    }

private var _SignRailroad: ImageVector? = null

