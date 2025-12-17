package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Caravan: ImageVector
    get() {
        if (_Caravan != null) return _Caravan!!
        
        _Caravan = ImageVector.Builder(
            name = "caravan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(416f, 208f)
                arcToRelative(16f, 16f, 0f, true, false, 16f, 16f)
                arcTo(16f, 16f, 0f, false, false, 416f, 208f)
                close()
                moveTo(624f, 320f)
                horizontalLineTo(576f)
                verticalLineTo(160f)
                arcTo(160f, 160f, 0f, false, false, 416f, 0f)
                horizontalLineTo(64f)
                arcTo(64f, 64f, 0f, false, false, 0f, 64f)
                verticalLineTo(320f)
                arcToRelative(64f, 64f, 0f, false, false, 64f, 64f)
                horizontalLineTo(96f)
                arcToRelative(96f, 96f, 0f, false, false, 192f, 0f)
                horizontalLineTo(624f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineTo(336f)
                arcTo(16f, 16f, 0f, false, false, 624f, 320f)
                close()
                moveTo(192f, 432f)
                arcToRelative(48f, 48f, 0f, true, true, 48f, -48f)
                arcTo(48.05f, 48.05f, 0f, false, true, 192f, 432f)
                close()
                moveToRelative(64f, -240f)
                arcToRelative(32f, 32f, 0f, false, true, -32f, 32f)
                horizontalLineTo(96f)
                arcToRelative(32f, 32f, 0f, false, true, -32f, -32f)
                verticalLineTo(128f)
                arcTo(32f, 32f, 0f, false, true, 96f, 96f)
                horizontalLineTo(224f)
                arcToRelative(32f, 32f, 0f, false, true, 32f, 32f)
                close()
                moveTo(448f, 320f)
                horizontalLineTo(320f)
                verticalLineTo(128f)
                arcToRelative(32f, 32f, 0f, false, true, 32f, -32f)
                horizontalLineToRelative(64f)
                arcToRelative(32f, 32f, 0f, false, true, 32f, 32f)
                close()
            }
        }.build()
        
        return _Caravan!!
    }

private var _Caravan: ImageVector? = null

