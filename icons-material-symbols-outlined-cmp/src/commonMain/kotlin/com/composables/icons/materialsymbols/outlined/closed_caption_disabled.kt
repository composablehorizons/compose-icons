package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Closed_caption_disabled: ImageVector
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
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 600f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 560f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 360f)
                horizontalLineToRelative(81f)
                close()
                moveToRelative(-86f, -200f)
                horizontalLineToRelative(485f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 240f)
                verticalLineToRelative(485f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-405f)
                horizontalLineTo(355f)
                lineToRelative(-80f, -80f)
                close()
                moveToRelative(445f, 360f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 9f, -3.5f, 17.5f)
                reflectiveQuadTo(706f, 591f)
                lineToRelative(-51f, -51f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-20f)
                horizontalLineToRelative(60f)
                close()
                moveToRelative(-60f, -80f)
                verticalLineToRelative(-20f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(45f)
                lineToRelative(-60f, -60f)
                verticalLineToRelative(-5f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(560f, 360f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 400f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(-102f, 2f)
                close()
                moveToRelative(-154f, 74f)
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
                horizontalLineTo(200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -25f, 13.5f, -44.5f)
                reflectiveQuadTo(168f, 167f)
                close()
            }
        }.build()
        
        return _Closed_caption_disabled!!
    }

private var _Closed_caption_disabled: ImageVector? = null

