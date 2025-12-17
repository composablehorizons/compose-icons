package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Quora: ImageVector
    get() {
        if (_Quora != null) return _Quora!!
        
        _Quora = ImageVector.Builder(
            name = "quora",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.73f, 12.476f)
                curveToRelative(-0.554f, -1.091f, -1.204f, -2.193f, -2.473f, -2.193f)
                curveToRelative(-0.242f, 0f, -0.484f, 0.04f, -0.707f, 0.142f)
                lineToRelative(-0.43f, -0.863f)
                curveToRelative(0.525f, -0.45f, 1.373f, -0.808f, 2.464f, -0.808f)
                curveToRelative(1.697f, 0f, 2.568f, 0.818f, 3.26f, 1.86f)
                curveToRelative(0.41f, -0.89f, 0.605f, -2.093f, 0.605f, -3.584f)
                curveToRelative(0f, -3.724f, -1.165f, -5.636f, -3.885f, -5.636f)
                curveToRelative(-2.68f, 0f, -3.839f, 1.912f, -3.839f, 5.636f)
                curveToRelative(0f, 3.704f, 1.159f, 5.596f, 3.84f, 5.596f)
                curveToRelative(0.425f, 0f, 0.811f, -0.046f, 1.166f, -0.15f)
                close()
                moveToRelative(0.665f, 1.3f)
                arcToRelative(7f, 7f, 0f, false, true, -1.83f, 0.244f)
                curveTo(3.994f, 14.02f, 0.5f, 11.172f, 0.5f, 7.03f)
                curveTo(0.5f, 2.849f, 3.995f, 0f, 7.564f, 0f)
                curveToRelative(3.63f, 0f, 7.09f, 2.828f, 7.09f, 7.03f)
                curveToRelative(0f, 2.337f, -1.09f, 4.236f, -2.675f, 5.464f)
                curveToRelative(0.512f, 0.767f, 1.04f, 1.277f, 1.773f, 1.277f)
                curveToRelative(0.802f, 0f, 1.125f, -0.62f, 1.179f, -1.105f)
                horizontalLineToRelative(1.043f)
                curveToRelative(0.061f, 0.647f, -0.262f, 3.334f, -3.178f, 3.334f)
                curveToRelative(-1.767f, 0f, -2.7f, -1.024f, -3.4f, -2.224f)
                close()
            }
        }.build()
        
        return _Quora!!
    }

private var _Quora: ImageVector? = null

