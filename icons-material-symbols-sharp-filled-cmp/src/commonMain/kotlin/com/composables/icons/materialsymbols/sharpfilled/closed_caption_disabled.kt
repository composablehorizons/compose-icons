package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Closed_caption_disabled: ImageVector
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
                moveTo(120f, 800f)
                verticalLineToRelative(-567f)
                lineToRelative(-93f, -93f)
                lineToRelative(57f, -57f)
                lineTo(876f, 875f)
                lineToRelative(-57f, 57f)
                lineToRelative(-132f, -132f)
                horizontalLineTo(120f)
                close()
                moveToRelative(720f, -75f)
                lineTo(715f, 600f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(-5f)
                lineToRelative(-75f, -75f)
                verticalLineToRelative(-45f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-80f)
                horizontalLineTo(520f)
                verticalLineToRelative(45f)
                lineTo(275f, 160f)
                horizontalLineToRelative(565f)
                verticalLineToRelative(565f)
                close()
                moveTo(240f, 600f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-47f)
                lineToRelative(-33f, -33f)
                horizontalLineToRelative(-27f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-127f)
                lineToRelative(-45f, -45f)
                horizontalLineToRelative(-15f)
                verticalLineToRelative(232f)
                close()
            }
        }.build()
        
        return _Closed_caption_disabled!!
    }

private var _Closed_caption_disabled: ImageVector? = null

