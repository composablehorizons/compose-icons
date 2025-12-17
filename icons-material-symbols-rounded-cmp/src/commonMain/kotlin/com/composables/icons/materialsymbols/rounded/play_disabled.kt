package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Play_disabled: ImageVector
    get() {
        if (_Play_disabled != null) return _Play_disabled!!
        
        _Play_disabled = ImageVector.Builder(
            name = "play_disabled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(658f, 544f)
                lineToRelative(-56f, -58f)
                lineToRelative(-38f, -36f)
                lineToRelative(-230f, -230f)
                quadToRelative(10f, -8f, 23f, -9.5f)
                reflectiveQuadToRelative(25f, 6.5f)
                lineToRelative(325f, 229f)
                quadToRelative(19f, 12f, 18.5f, 34f)
                reflectiveQuadTo(706f, 514f)
                lineToRelative(-48f, 30f)
                close()
                moveTo(762f, 876f)
                lineTo(520f, 632f)
                lineToRelative(-138f, 89f)
                quadToRelative(-20f, 13f, -41f, 1.5f)
                reflectiveQuadTo(320f, 687f)
                verticalLineToRelative(-255f)
                lineTo(84f, 196f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(679f, 679f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(819f, 876f)
                quadToRelative(-12f, 11f, -28.5f, 11.5f)
                reflectiveQuadTo(762f, 876f)
                close()
                moveTo(400f, 512f)
                close()
                moveToRelative(0f, 102f)
                lineToRelative(62f, -40f)
                lineToRelative(-62f, -62f)
                verticalLineToRelative(102f)
                close()
                moveToRelative(202f, -128f)
                close()
            }
        }.build()
        
        return _Play_disabled!!
    }

private var _Play_disabled: ImageVector? = null

