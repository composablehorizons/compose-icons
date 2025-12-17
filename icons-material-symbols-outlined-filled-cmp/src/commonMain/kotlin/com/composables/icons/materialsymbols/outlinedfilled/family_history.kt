package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Family_history: ImageVector
    get() {
        if (_Family_history != null) return _Family_history!!
        
        _Family_history = ImageVector.Builder(
            name = "family_history",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 900f)
                quadToRelative(-63f, 0f, -106.5f, -43.5f)
                reflectiveQuadTo(330f, 750f)
                quadToRelative(0f, -52f, 31f, -91.5f)
                reflectiveQuadToRelative(79f, -53.5f)
                verticalLineToRelative(-85f)
                horizontalLineTo(200f)
                verticalLineToRelative(-160f)
                horizontalLineTo(100f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(280f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-85f)
                quadToRelative(-48f, -14f, -79f, -53.5f)
                reflectiveQuadTo(570f, 210f)
                quadToRelative(0f, -63f, 43.5f, -106.5f)
                reflectiveQuadTo(720f, 60f)
                quadToRelative(63f, 0f, 106.5f, 43.5f)
                reflectiveQuadTo(870f, 210f)
                quadToRelative(0f, 52f, -31f, 91.5f)
                reflectiveQuadTo(760f, 355f)
                verticalLineToRelative(165f)
                horizontalLineTo(520f)
                verticalLineToRelative(85f)
                quadToRelative(48f, 14f, 79f, 53.5f)
                reflectiveQuadToRelative(31f, 91.5f)
                quadToRelative(0f, 63f, -43.5f, 106.5f)
                reflectiveQuadTo(480f, 900f)
                close()
            }
        }.build()
        
        return _Family_history!!
    }

private var _Family_history: ImageVector? = null

