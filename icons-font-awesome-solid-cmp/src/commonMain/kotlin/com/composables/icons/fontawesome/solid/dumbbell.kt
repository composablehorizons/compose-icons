package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Dumbbell: ImageVector
    get() {
        if (_Dumbbell != null) return _Dumbbell!!
        
        _Dumbbell = ImageVector.Builder(
            name = "dumbbell",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(104f, 96f)
                horizontalLineTo(56f)
                curveToRelative(-13.3f, 0f, -24f, 10.7f, -24f, 24f)
                verticalLineToRelative(104f)
                horizontalLineTo(8f)
                curveToRelative(-4.4f, 0f, -8f, 3.6f, -8f, 8f)
                verticalLineToRelative(48f)
                curveToRelative(0f, 4.4f, 3.6f, 8f, 8f, 8f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(104f)
                curveToRelative(0f, 13.3f, 10.7f, 24f, 24f, 24f)
                horizontalLineToRelative(48f)
                curveToRelative(13.3f, 0f, 24f, -10.7f, 24f, -24f)
                verticalLineTo(120f)
                curveToRelative(0f, -13.3f, -10.7f, -24f, -24f, -24f)
                close()
                moveToRelative(528f, 128f)
                horizontalLineToRelative(-24f)
                verticalLineTo(120f)
                curveToRelative(0f, -13.3f, -10.7f, -24f, -24f, -24f)
                horizontalLineToRelative(-48f)
                curveToRelative(-13.3f, 0f, -24f, 10.7f, -24f, 24f)
                verticalLineToRelative(272f)
                curveToRelative(0f, 13.3f, 10.7f, 24f, 24f, 24f)
                horizontalLineToRelative(48f)
                curveToRelative(13.3f, 0f, 24f, -10.7f, 24f, -24f)
                verticalLineTo(288f)
                horizontalLineToRelative(24f)
                curveToRelative(4.4f, 0f, 8f, -3.6f, 8f, -8f)
                verticalLineToRelative(-48f)
                curveToRelative(0f, -4.4f, -3.6f, -8f, -8f, -8f)
                close()
                moveTo(456f, 32f)
                horizontalLineToRelative(-48f)
                curveToRelative(-13.3f, 0f, -24f, 10.7f, -24f, 24f)
                verticalLineToRelative(168f)
                horizontalLineTo(256f)
                verticalLineTo(56f)
                curveToRelative(0f, -13.3f, -10.7f, -24f, -24f, -24f)
                horizontalLineToRelative(-48f)
                curveToRelative(-13.3f, 0f, -24f, 10.7f, -24f, 24f)
                verticalLineToRelative(400f)
                curveToRelative(0f, 13.3f, 10.7f, 24f, 24f, 24f)
                horizontalLineToRelative(48f)
                curveToRelative(13.3f, 0f, 24f, -10.7f, 24f, -24f)
                verticalLineTo(288f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(168f)
                curveToRelative(0f, 13.3f, 10.7f, 24f, 24f, 24f)
                horizontalLineToRelative(48f)
                curveToRelative(13.3f, 0f, 24f, -10.7f, 24f, -24f)
                verticalLineTo(56f)
                curveToRelative(0f, -13.3f, -10.7f, -24f, -24f, -24f)
                close()
            }
        }.build()
        
        return _Dumbbell!!
    }

private var _Dumbbell: ImageVector? = null

