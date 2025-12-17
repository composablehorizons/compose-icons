package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ListStars: ImageVector
    get() {
        if (_ListStars != null) return _ListStars!!
        
        _ListStars = ImageVector.Builder(
            name = "list-stars",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 11.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                moveToRelative(0f, -4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                moveToRelative(0f, -4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.242f, 2.194f)
                arcToRelative(0.27f, 0.27f, 0f, false, true, 0.516f, 0f)
                lineToRelative(0.162f, 0.53f)
                curveToRelative(0.035f, 0.115f, 0.14f, 0.194f, 0.258f, 0.194f)
                horizontalLineToRelative(0.551f)
                curveToRelative(0.259f, 0f, 0.37f, 0.333f, 0.164f, 0.493f)
                lineToRelative(-0.468f, 0.363f)
                arcToRelative(0.28f, 0.28f, 0f, false, false, -0.094f, 0.3f)
                lineToRelative(0.173f, 0.569f)
                curveToRelative(0.078f, 0.256f, -0.213f, 0.462f, -0.423f, 0.3f)
                lineToRelative(-0.417f, -0.324f)
                arcToRelative(0.27f, 0.27f, 0f, false, false, -0.328f, 0f)
                lineToRelative(-0.417f, 0.323f)
                curveToRelative(-0.21f, 0.163f, -0.5f, -0.043f, -0.423f, -0.299f)
                lineToRelative(0.173f, -0.57f)
                arcToRelative(0.28f, 0.28f, 0f, false, false, -0.094f, -0.299f)
                lineToRelative(-0.468f, -0.363f)
                curveToRelative(-0.206f, -0.16f, -0.095f, -0.493f, 0.164f, -0.493f)
                horizontalLineToRelative(0.55f)
                arcToRelative(0.27f, 0.27f, 0f, false, false, 0.259f, -0.194f)
                close()
                moveToRelative(0f, 4f)
                arcToRelative(0.27f, 0.27f, 0f, false, true, 0.516f, 0f)
                lineToRelative(0.162f, 0.53f)
                curveToRelative(0.035f, 0.115f, 0.14f, 0.194f, 0.258f, 0.194f)
                horizontalLineToRelative(0.551f)
                curveToRelative(0.259f, 0f, 0.37f, 0.333f, 0.164f, 0.493f)
                lineToRelative(-0.468f, 0.363f)
                arcToRelative(0.28f, 0.28f, 0f, false, false, -0.094f, 0.3f)
                lineToRelative(0.173f, 0.569f)
                curveToRelative(0.078f, 0.255f, -0.213f, 0.462f, -0.423f, 0.3f)
                lineToRelative(-0.417f, -0.324f)
                arcToRelative(0.27f, 0.27f, 0f, false, false, -0.328f, 0f)
                lineToRelative(-0.417f, 0.323f)
                curveToRelative(-0.21f, 0.163f, -0.5f, -0.043f, -0.423f, -0.299f)
                lineToRelative(0.173f, -0.57f)
                arcToRelative(0.28f, 0.28f, 0f, false, false, -0.094f, -0.299f)
                lineToRelative(-0.468f, -0.363f)
                curveToRelative(-0.206f, -0.16f, -0.095f, -0.493f, 0.164f, -0.493f)
                horizontalLineToRelative(0.55f)
                arcToRelative(0.27f, 0.27f, 0f, false, false, 0.259f, -0.194f)
                close()
                moveToRelative(0f, 4f)
                arcToRelative(0.27f, 0.27f, 0f, false, true, 0.516f, 0f)
                lineToRelative(0.162f, 0.53f)
                curveToRelative(0.035f, 0.115f, 0.14f, 0.194f, 0.258f, 0.194f)
                horizontalLineToRelative(0.551f)
                curveToRelative(0.259f, 0f, 0.37f, 0.333f, 0.164f, 0.493f)
                lineToRelative(-0.468f, 0.363f)
                arcToRelative(0.28f, 0.28f, 0f, false, false, -0.094f, 0.3f)
                lineToRelative(0.173f, 0.569f)
                curveToRelative(0.078f, 0.255f, -0.213f, 0.462f, -0.423f, 0.3f)
                lineToRelative(-0.417f, -0.324f)
                arcToRelative(0.27f, 0.27f, 0f, false, false, -0.328f, 0f)
                lineToRelative(-0.417f, 0.323f)
                curveToRelative(-0.21f, 0.163f, -0.5f, -0.043f, -0.423f, -0.299f)
                lineToRelative(0.173f, -0.57f)
                arcToRelative(0.28f, 0.28f, 0f, false, false, -0.094f, -0.299f)
                lineToRelative(-0.468f, -0.363f)
                curveToRelative(-0.206f, -0.16f, -0.095f, -0.493f, 0.164f, -0.493f)
                horizontalLineToRelative(0.55f)
                arcToRelative(0.27f, 0.27f, 0f, false, false, 0.259f, -0.194f)
                close()
            }
        }.build()
        
        return _ListStars!!
    }

private var _ListStars: ImageVector? = null

