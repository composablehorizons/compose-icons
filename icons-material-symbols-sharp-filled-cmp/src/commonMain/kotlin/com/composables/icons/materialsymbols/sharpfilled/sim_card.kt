package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Sim_card: ImageVector
    get() {
        if (_Sim_card != null) return _Sim_card!!
        
        _Sim_card = ImageVector.Builder(
            name = "sim_card",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 760f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(160f, 160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(0f, -240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(160f, 240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                close()
                moveTo(160f, 880f)
                verticalLineToRelative(-560f)
                lineToRelative(240f, -240f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(800f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Sim_card!!
    }

private var _Sim_card: ImageVector? = null

