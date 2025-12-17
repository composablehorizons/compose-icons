package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Thumb_up: ImageVector
    get() {
        if (_Thumb_up != null) return _Thumb_up!!
        
        _Thumb_up = ImageVector.Builder(
            name = "thumb_up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 840f)
                horizontalLineTo(320f)
                verticalLineToRelative(-520f)
                lineToRelative(280f, -280f)
                lineToRelative(50f, 50f)
                quadToRelative(7f, 7f, 11.5f, 19f)
                reflectiveQuadToRelative(4.5f, 23f)
                verticalLineToRelative(14f)
                lineToRelative(-44f, 174f)
                horizontalLineToRelative(218f)
                quadToRelative(32f, 0f, 56f, 24f)
                reflectiveQuadToRelative(24f, 56f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 7f, -1.5f, 15f)
                reflectiveQuadToRelative(-4.5f, 15f)
                lineTo(794f, 792f)
                quadToRelative(-9f, 20f, -30f, 34f)
                reflectiveQuadToRelative(-44f, 14f)
                close()
                moveTo(240f, 320f)
                verticalLineToRelative(520f)
                horizontalLineTo(80f)
                verticalLineToRelative(-520f)
                horizontalLineToRelative(160f)
                close()
            }
        }.build()
        
        return _Thumb_up!!
    }

private var _Thumb_up: ImageVector? = null

