package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Sim_card_download: ImageVector
    get() {
        if (_Sim_card_download != null) return _Sim_card_download!!
        
        _Sim_card_download = ImageVector.Builder(
            name = "sim_card_download",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 680f)
                lineToRelative(160f, -160f)
                lineToRelative(-56f, -56f)
                lineToRelative(-64f, 62f)
                verticalLineToRelative(-166f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(166f)
                lineToRelative(-64f, -62f)
                lineToRelative(-56f, 56f)
                lineToRelative(160f, 160f)
                close()
                moveTo(160f, 880f)
                verticalLineToRelative(-560f)
                lineToRelative(240f, -240f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-640f)
                horizontalLineTo(434f)
                lineTo(240f, 354f)
                verticalLineToRelative(446f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(480f)
                horizontalLineToRelative(-480f)
                close()
            }
        }.build()
        
        return _Sim_card_download!!
    }

private var _Sim_card_download: ImageVector? = null

