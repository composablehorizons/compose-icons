package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.UserLock: ImageVector
    get() {
        if (_UserLock != null) return _UserLock!!
        
        _UserLock = ImageVector.Builder(
            name = "user-lock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(224f, 256f)
                arcTo(128f, 128f, 0f, true, false, 96f, 128f)
                arcToRelative(128f, 128f, 0f, false, false, 128f, 128f)
                close()
                moveToRelative(96f, 64f)
                arcToRelative(63.08f, 63.08f, 0f, false, true, 8.1f, -30.5f)
                curveToRelative(-4.8f, -0.5f, -9.5f, -1.5f, -14.5f, -1.5f)
                horizontalLineToRelative(-16.7f)
                arcToRelative(174.08f, 174.08f, 0f, false, true, -145.8f, 0f)
                horizontalLineToRelative(-16.7f)
                arcTo(134.43f, 134.43f, 0f, false, false, 0f, 422.4f)
                verticalLineTo(464f)
                arcToRelative(48f, 48f, 0f, false, false, 48f, 48f)
                horizontalLineToRelative(280.9f)
                arcToRelative(63.54f, 63.54f, 0f, false, true, -8.9f, -32f)
                close()
                moveToRelative(288f, -32f)
                horizontalLineToRelative(-32f)
                verticalLineToRelative(-80f)
                arcToRelative(80f, 80f, 0f, false, false, -160f, 0f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-32f)
                arcToRelative(32f, 32f, 0f, false, false, -32f, 32f)
                verticalLineToRelative(160f)
                arcToRelative(32f, 32f, 0f, false, false, 32f, 32f)
                horizontalLineToRelative(224f)
                arcToRelative(32f, 32f, 0f, false, false, 32f, -32f)
                verticalLineTo(320f)
                arcToRelative(32f, 32f, 0f, false, false, -32f, -32f)
                close()
                moveTo(496f, 432f)
                arcToRelative(32f, 32f, 0f, true, true, 32f, -32f)
                arcToRelative(32f, 32f, 0f, false, true, -32f, 32f)
                close()
                moveToRelative(32f, -144f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(-80f)
                arcToRelative(32f, 32f, 0f, false, true, 64f, 0f)
                close()
            }
        }.build()
        
        return _UserLock!!
    }

private var _UserLock: ImageVector? = null

