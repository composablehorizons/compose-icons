package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.SignInAlt: ImageVector
    get() {
        if (_SignInAlt != null) return _SignInAlt!!
        
        _SignInAlt = ImageVector.Builder(
            name = "sign-in-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(416f, 448f)
                horizontalLineToRelative(-84f)
                curveToRelative(-6.6f, 0f, -12f, -5.4f, -12f, -12f)
                verticalLineToRelative(-40f)
                curveToRelative(0f, -6.6f, 5.4f, -12f, 12f, -12f)
                horizontalLineToRelative(84f)
                curveToRelative(17.7f, 0f, 32f, -14.3f, 32f, -32f)
                verticalLineTo(160f)
                curveToRelative(0f, -17.7f, -14.3f, -32f, -32f, -32f)
                horizontalLineToRelative(-84f)
                curveToRelative(-6.6f, 0f, -12f, -5.4f, -12f, -12f)
                verticalLineTo(76f)
                curveToRelative(0f, -6.6f, 5.4f, -12f, 12f, -12f)
                horizontalLineToRelative(84f)
                curveToRelative(53f, 0f, 96f, 43f, 96f, 96f)
                verticalLineToRelative(192f)
                curveToRelative(0f, 53f, -43f, 96f, -96f, 96f)
                close()
                moveToRelative(-47f, -201f)
                lineTo(201f, 79f)
                curveToRelative(-15f, -15f, -41f, -4.5f, -41f, 17f)
                verticalLineToRelative(96f)
                horizontalLineTo(24f)
                curveToRelative(-13.3f, 0f, -24f, 10.7f, -24f, 24f)
                verticalLineToRelative(96f)
                curveToRelative(0f, 13.3f, 10.7f, 24f, 24f, 24f)
                horizontalLineToRelative(136f)
                verticalLineToRelative(96f)
                curveToRelative(0f, 21.5f, 26f, 32f, 41f, 17f)
                lineToRelative(168f, -168f)
                curveToRelative(9.3f, -9.4f, 9.3f, -24.6f, 0f, -34f)
                close()
            }
        }.build()
        
        return _SignInAlt!!
    }

private var _SignInAlt: ImageVector? = null

