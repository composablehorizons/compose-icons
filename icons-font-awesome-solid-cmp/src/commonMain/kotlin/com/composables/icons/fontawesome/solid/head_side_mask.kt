package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.HeadSideMask: ImageVector
    get() {
        if (_HeadSideMask != null) return _HeadSideMask!!
        
        _HeadSideMask = ImageVector.Builder(
            name = "head-side-mask",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0.15f, 184.42f)
                curveTo(-2.17f, 244.21f, 23f, 298.06f, 64f, 334.88f)
                verticalLineTo(512f)
                horizontalLineTo(224f)
                verticalLineTo(316.51f)
                lineTo(3.67f, 156.25f)
                arcTo(182.28f, 182.28f, 0f, false, false, 0.15f, 184.42f)
                close()
                moveTo(509.22f, 275f)
                curveToRelative(-21f, -47.12f, -48.5f, -151.75f, -73.12f, -186.75f)
                arcTo(208.11f, 208.11f, 0f, false, false, 266.11f, 0f)
                horizontalLineTo(200f)
                curveTo(117f, 0f, 42.48f, 50.57f, 13.25f, 123.65f)
                lineTo(239.21f, 288f)
                horizontalLineTo(511.76f)
                arcTo(31.35f, 31.35f, 0f, false, false, 509.22f, 275f)
                close()
                moveTo(320f, 224f)
                arcToRelative(32f, 32f, 0f, true, true, 32f, -32f)
                arcTo(32.07f, 32.07f, 0f, false, true, 320f, 224f)
                close()
                moveToRelative(16f, 144f)
                horizontalLineTo(496f)
                lineToRelative(16f, -48f)
                horizontalLineTo(256f)
                verticalLineTo(512f)
                horizontalLineTo(401.88f)
                arcToRelative(64f, 64f, 0f, false, false, 60.71f, -43.76f)
                lineTo(464f, 464f)
                horizontalLineTo(336f)
                arcToRelative(16f, 16f, 0f, false, true, 0f, -32f)
                horizontalLineTo(474.67f)
                lineToRelative(10.67f, -32f)
                horizontalLineTo(336f)
                arcToRelative(16f, 16f, 0f, false, true, 0f, -32f)
                close()
            }
        }.build()
        
        return _HeadSideMask!!
    }

private var _HeadSideMask: ImageVector? = null

