package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.MicrosoftTeams: ImageVector
    get() {
        if (_MicrosoftTeams != null) return _MicrosoftTeams!!
        
        _MicrosoftTeams = ImageVector.Builder(
            name = "microsoft-teams",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.186f, 4.797f)
                arcToRelative(2.42f, 2.42f, 0f, true, false, -2.86f, -2.448f)
                horizontalLineToRelative(1.178f)
                curveToRelative(0.929f, 0f, 1.682f, 0.753f, 1.682f, 1.682f)
                close()
                moveToRelative(-4.295f, 7.738f)
                horizontalLineToRelative(2.613f)
                curveToRelative(0.929f, 0f, 1.682f, -0.753f, 1.682f, -1.682f)
                verticalLineTo(5.58f)
                horizontalLineToRelative(2.783f)
                arcToRelative(0.7f, 0.7f, 0f, false, true, 0.682f, 0.716f)
                verticalLineToRelative(4.294f)
                arcToRelative(4.197f, 4.197f, 0f, false, true, -4.093f, 4.293f)
                curveToRelative(-1.618f, -0.04f, -3f, -0.99f, -3.667f, -2.35f)
                close()
                moveToRelative(10.737f, -9.372f)
                arcToRelative(1.674f, 1.674f, 0f, true, true, -3.349f, 0f)
                arcToRelative(1.674f, 1.674f, 0f, false, true, 3.349f, 0f)
                moveToRelative(-2.238f, 9.488f)
                lineToRelative(-0.12f, -0.002f)
                arcToRelative(5.2f, 5.2f, 0f, false, false, 0.381f, -2.07f)
                verticalLineTo(6.306f)
                arcToRelative(1.7f, 1.7f, 0f, false, false, -0.15f, -0.725f)
                horizontalLineToRelative(1.792f)
                curveToRelative(0.39f, 0f, 0.707f, 0.317f, 0.707f, 0.707f)
                verticalLineToRelative(3.765f)
                arcToRelative(2.6f, 2.6f, 0f, false, true, -2.598f, 2.598f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0.682f, 3.349f)
                horizontalLineToRelative(6.822f)
                curveToRelative(0.377f, 0f, 0.682f, 0.305f, 0.682f, 0.682f)
                verticalLineToRelative(6.822f)
                arcToRelative(0.68f, 0.68f, 0f, false, true, -0.682f, 0.682f)
                horizontalLineTo(0.682f)
                arcTo(0.68f, 0.68f, 0f, false, true, 0f, 10.853f)
                verticalLineTo(4.03f)
                curveToRelative(0f, -0.377f, 0.305f, -0.682f, 0.682f, -0.682f)
                close()
                moveToRelative(5.206f, 2.596f)
                verticalLineToRelative(-0.72f)
                horizontalLineToRelative(-3.59f)
                verticalLineToRelative(0.72f)
                horizontalLineToRelative(1.357f)
                verticalLineTo(9.66f)
                horizontalLineToRelative(0.87f)
                verticalLineTo(5.945f)
                close()
            }
        }.build()
        
        return _MicrosoftTeams!!
    }

private var _MicrosoftTeams: ImageVector? = null

