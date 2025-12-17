package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Closed_caption_disabled: ImageVector
    get() {
        if (_Closed_caption_disabled != null) return _Closed_caption_disabled!!
        
        _Closed_caption_disabled = ImageVector.Builder(
            name = "closed_caption_disabled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(361f, 360f)
                lineToRelative(60f, 60f)
                horizontalLineTo(300f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-20f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(121f)
                close()
                moveToRelative(-86f, -200f)
                horizontalLineToRelative(565f)
                verticalLineToRelative(565f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-405f)
                horizontalLineTo(355f)
                lineToRelative(-80f, -80f)
                close()
                moveToRelative(445f, 360f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-5f)
                lineToRelative(-60f, -60f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-20f)
                horizontalLineToRelative(60f)
                close()
                moveToRelative(-60f, -80f)
                verticalLineToRelative(-20f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(45f)
                lineToRelative(-60f, -60f)
                verticalLineToRelative(-45f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(-102f, 2f)
                close()
                moveToRelative(-154f, 75f)
                verticalLineToRelative(-1f)
                verticalLineToRelative(1f)
                close()
                moveTo(168f, 167f)
                lineToRelative(73f, 73f)
                horizontalLineToRelative(-41f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(407f)
                lineTo(27f, 140f)
                lineToRelative(57f, -57f)
                lineTo(876f, 875f)
                lineToRelative(-57f, 57f)
                lineToRelative(-132f, -132f)
                horizontalLineTo(120f)
                verticalLineToRelative(-633f)
                horizontalLineToRelative(48f)
                close()
            }
        }.build()
        
        return _Closed_caption_disabled!!
    }

private var _Closed_caption_disabled: ImageVector? = null

