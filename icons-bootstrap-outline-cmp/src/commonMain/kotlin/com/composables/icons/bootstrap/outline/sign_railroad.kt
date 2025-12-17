package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.SignRailroad: ImageVector
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
                moveTo(11.303f, 6.584f)
                horizontalLineToRelative(1.064f)
                curveToRelative(0.592f, 0f, 0.936f, 0.334f, 0.936f, 0.844f)
                arcToRelative(0.79f, 0.79f, 0f, false, true, -0.485f, 0.748f)
                lineToRelative(0.536f, 1.074f)
                horizontalLineToRelative(-0.59f)
                lineToRelative(-0.467f, -0.994f)
                horizontalLineToRelative(-0.473f)
                verticalLineToRelative(0.994f)
                horizontalLineToRelative(-0.521f)
                close()
                moveToRelative(0.521f, 0.414f)
                verticalLineToRelative(0.861f)
                horizontalLineToRelative(0.46f)
                curveToRelative(0.292f, 0f, 0.474f, -0.14f, 0.474f, -0.421f)
                curveToRelative(0f, -0.286f, -0.188f, -0.44f, -0.467f, -0.44f)
                close()
                moveToRelative(-8.771f, -0.414f)
                horizontalLineToRelative(1.064f)
                curveToRelative(0.592f, 0f, 0.936f, 0.334f, 0.936f, 0.844f)
                curveToRelative(0f, 0.39f, -0.242f, 0.654f, -0.485f, 0.748f)
                lineToRelative(0.536f, 1.074f)
                horizontalLineToRelative(-0.59f)
                lineToRelative(-0.467f, -0.994f)
                horizontalLineToRelative(-0.473f)
                verticalLineToRelative(0.994f)
                horizontalLineToRelative(-0.521f)
                close()
                moveToRelative(0.521f, 0.414f)
                verticalLineToRelative(0.861f)
                horizontalLineToRelative(0.46f)
                curveToRelative(0.292f, 0f, 0.474f, -0.14f, 0.474f, -0.421f)
                curveToRelative(0f, -0.286f, -0.188f, -0.44f, -0.467f, -0.44f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.95f, 0.435f)
                curveToRelative(0.58f, -0.58f, 1.52f, -0.58f, 2.1f, 0f)
                lineToRelative(6.515f, 6.516f)
                curveToRelative(0.58f, 0.58f, 0.58f, 1.519f, 0f, 2.098f)
                lineTo(9.05f, 15.565f)
                curveToRelative(-0.58f, 0.58f, -1.519f, 0.58f, -2.098f, 0f)
                lineTo(0.435f, 9.05f)
                arcToRelative(1.48f, 1.48f, 0f, false, true, 0f, -2.098f)
                close()
                moveToRelative(1.4f, 0.7f)
                arcToRelative(0.495f, 0.495f, 0f, false, false, -0.7f, 0f)
                lineTo(4.923f, 3.861f)
                lineTo(8f, 6.939f)
                lineToRelative(3.078f, -3.077f)
                lineTo(8.35f, 1.134f)
                close()
                moveToRelative(3.788f, 3.788f)
                lineTo(9.061f, 8f)
                lineToRelative(3.077f, 3.078f)
                lineToRelative(2.728f, -2.728f)
                arcToRelative(0.495f, 0.495f, 0f, false, false, 0f, -0.7f)
                close()
                moveToRelative(-1.06f, 7.215f)
                lineTo(8f, 9.061f)
                lineToRelative(-3.077f, 3.077f)
                lineToRelative(2.727f, 2.728f)
                arcToRelative(0.495f, 0.495f, 0f, false, false, 0.7f, 0f)
                close()
                moveToRelative(-7.216f, -1.06f)
                lineTo(6.939f, 8f)
                lineTo(3.862f, 4.923f)
                lineTo(1.134f, 7.65f)
                arcToRelative(0.495f, 0.495f, 0f, false, false, 0f, 0.7f)
                close()
            }
        }.build()
        
        return _SignRailroad!!
    }

private var _SignRailroad: ImageVector? = null

