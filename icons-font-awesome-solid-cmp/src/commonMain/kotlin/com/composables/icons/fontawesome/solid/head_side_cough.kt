package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.HeadSideCough: ImageVector
    get() {
        if (_HeadSideCough != null) return _HeadSideCough!!
        
        _HeadSideCough = ImageVector.Builder(
            name = "head-side-cough",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(616f, 304f)
                arcToRelative(24f, 24f, 0f, true, false, -24f, -24f)
                arcTo(24f, 24f, 0f, false, false, 616f, 304f)
                close()
                moveTo(552f, 416f)
                arcToRelative(24f, 24f, 0f, true, false, 24f, 24f)
                arcTo(24f, 24f, 0f, false, false, 552f, 416f)
                close()
                moveToRelative(-64f, -56f)
                arcToRelative(24f, 24f, 0f, true, false, 24f, 24f)
                arcTo(24f, 24f, 0f, false, false, 488f, 360f)
                close()
                moveTo(616f, 464f)
                arcToRelative(24f, 24f, 0f, true, false, 24f, 24f)
                arcTo(24f, 24f, 0f, false, false, 616f, 464f)
                close()
                moveToRelative(0f, -104f)
                arcToRelative(24f, 24f, 0f, true, false, 24f, 24f)
                arcTo(24f, 24f, 0f, false, false, 616f, 360f)
                close()
                moveToRelative(-64f, -40f)
                arcToRelative(24f, 24f, 0f, true, false, 24f, 24f)
                arcTo(24f, 24f, 0f, false, false, 552f, 320f)
                close()
                moveToRelative(-74.78f, -45f)
                curveToRelative(-21f, -47.12f, -48.5f, -151.75f, -73.12f, -186.75f)
                arcTo(208.13f, 208.13f, 0f, false, false, 234.1f, 0f)
                horizontalLineTo(192f)
                curveTo(86f, 0f, 0f, 86f, 0f, 192f)
                curveToRelative(0f, 56.75f, 24.75f, 107.62f, 64f, 142.88f)
                verticalLineTo(512f)
                horizontalLineTo(288f)
                verticalLineTo(480f)
                horizontalLineToRelative(64f)
                arcToRelative(64f, 64f, 0f, false, false, 64f, -64f)
                horizontalLineTo(320f)
                arcToRelative(32f, 32f, 0f, false, true, 0f, -64f)
                horizontalLineToRelative(96f)
                verticalLineTo(320f)
                horizontalLineToRelative(32f)
                arcTo(32f, 32f, 0f, false, false, 477.22f, 275f)
                close()
                moveTo(288f, 224f)
                arcToRelative(32f, 32f, 0f, true, true, 32f, -32f)
                arcTo(32.07f, 32.07f, 0f, false, true, 288f, 224f)
                close()
            }
        }.build()
        
        return _HeadSideCough!!
    }

private var _HeadSideCough: ImageVector? = null

