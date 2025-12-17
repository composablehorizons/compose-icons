package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Soap: ImageVector
    get() {
        if (_Soap != null) return _Soap!!
        
        _Soap = ImageVector.Builder(
            name = "soap",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(416f, 192f)
                arcToRelative(95.42f, 95.42f, 0f, false, true, -30.94f, 70.21f)
                arcTo(95.8f, 95.8f, 0f, false, true, 352f, 448f)
                horizontalLineTo(160f)
                arcToRelative(96f, 96f, 0f, false, true, 0f, -192f)
                horizontalLineToRelative(88.91f)
                arcTo(95.3f, 95.3f, 0f, false, true, 224f, 192f)
                horizontalLineTo(96f)
                arcTo(96f, 96f, 0f, false, false, 0f, 288f)
                verticalLineTo(416f)
                arcToRelative(96f, 96f, 0f, false, false, 96f, 96f)
                horizontalLineTo(416f)
                arcToRelative(96f, 96f, 0f, false, false, 96f, -96f)
                verticalLineTo(288f)
                arcTo(96f, 96f, 0f, false, false, 416f, 192f)
                close()
                moveToRelative(-96f, 64f)
                arcToRelative(64f, 64f, 0f, true, false, -64f, -64f)
                arcTo(64f, 64f, 0f, false, false, 320f, 256f)
                close()
                moveTo(208f, 96f)
                arcToRelative(48f, 48f, 0f, true, false, -48f, -48f)
                arcTo(48f, 48f, 0f, false, false, 208f, 96f)
                close()
                moveTo(384f, 64f)
                arcToRelative(32f, 32f, 0f, true, false, -32f, -32f)
                arcTo(32f, 32f, 0f, false, false, 384f, 64f)
                close()
                moveTo(160f, 288f)
                arcToRelative(64f, 64f, 0f, false, false, 0f, 128f)
                horizontalLineTo(352f)
                arcToRelative(64f, 64f, 0f, false, false, 0f, -128f)
                close()
            }
        }.build()
        
        return _Soap!!
    }

private var _Soap: ImageVector? = null

