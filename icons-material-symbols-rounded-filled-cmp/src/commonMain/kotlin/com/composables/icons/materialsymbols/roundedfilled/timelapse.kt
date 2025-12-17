package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Timelapse: ImageVector
    get() {
        if (_Timelapse != null) return _Timelapse!!
        
        _Timelapse = ImageVector.Builder(
            name = "timelapse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 720f)
                quadToRelative(100f, 0f, 170f, -70f)
                reflectiveQuadToRelative(70f, -170f)
                quadToRelative(0f, -87f, -55.5f, -153f)
                reflectiveQuadTo(524f, 244f)
                quadToRelative(-18f, -2f, -31f, 10f)
                reflectiveQuadToRelative(-13f, 30f)
                verticalLineToRelative(196f)
                lineTo(342f, 618f)
                quadToRelative(-13f, 13f, -12f, 31f)
                reflectiveQuadToRelative(15f, 29f)
                quadToRelative(29f, 23f, 64f, 32.5f)
                reflectiveQuadToRelative(71f, 9.5f)
                close()
                moveToRelative(0f, 160f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Timelapse!!
    }

private var _Timelapse: ImageVector? = null

