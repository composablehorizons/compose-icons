package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Translate: ImageVector
    get() {
        if (_Translate != null) return _Translate!!
        
        _Translate = ImageVector.Builder(
            name = "translate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(476f, 880f)
                lineToRelative(182f, -480f)
                horizontalLineToRelative(84f)
                lineTo(924f, 880f)
                horizontalLineToRelative(-84f)
                lineToRelative(-43f, -122f)
                horizontalLineTo(603f)
                lineTo(560f, 880f)
                horizontalLineToRelative(-84f)
                close()
                moveTo(160f, 760f)
                lineToRelative(-56f, -56f)
                lineToRelative(202f, -202f)
                quadToRelative(-35f, -35f, -63.5f, -80f)
                reflectiveQuadTo(190f, 320f)
                horizontalLineToRelative(84f)
                quadToRelative(20f, 39f, 40f, 68f)
                reflectiveQuadToRelative(48f, 58f)
                quadToRelative(33f, -33f, 68.5f, -92.5f)
                reflectiveQuadTo(484f, 240f)
                horizontalLineTo(40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                horizontalLineTo(564f)
                quadToRelative(-21f, 72f, -63f, 148f)
                reflectiveQuadToRelative(-83f, 116f)
                lineToRelative(96f, 98f)
                lineToRelative(-30f, 82f)
                lineToRelative(-122f, -125f)
                lineToRelative(-202f, 201f)
                close()
                moveToRelative(468f, -72f)
                horizontalLineToRelative(144f)
                lineToRelative(-72f, -204f)
                lineToRelative(-72f, 204f)
                close()
            }
        }.build()
        
        return _Translate!!
    }

private var _Translate: ImageVector? = null

