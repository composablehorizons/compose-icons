package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Ac_unit: ImageVector
    get() {
        if (_Ac_unit != null) return _Ac_unit!!
        
        _Ac_unit = ImageVector.Builder(
            name = "ac_unit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 880f)
                verticalLineToRelative(-166f)
                lineTo(310f, 842f)
                lineToRelative(-56f, -56f)
                lineToRelative(186f, -186f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                lineTo(174f, 706f)
                lineToRelative(-56f, -56f)
                lineToRelative(128f, -130f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(166f)
                lineTo(118f, 310f)
                lineToRelative(56f, -56f)
                lineToRelative(186f, 186f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                lineTo(254f, 174f)
                lineToRelative(56f, -56f)
                lineToRelative(130f, 128f)
                verticalLineToRelative(-166f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(166f)
                lineToRelative(130f, -128f)
                lineToRelative(56f, 56f)
                lineToRelative(-186f, 186f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                lineToRelative(186f, -186f)
                lineToRelative(56f, 56f)
                lineToRelative(-128f, 130f)
                horizontalLineToRelative(166f)
                verticalLineToRelative(80f)
                horizontalLineTo(714f)
                lineToRelative(128f, 130f)
                lineToRelative(-56f, 56f)
                lineToRelative(-186f, -186f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                lineToRelative(186f, 186f)
                lineToRelative(-56f, 56f)
                lineToRelative(-130f, -128f)
                verticalLineToRelative(166f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Ac_unit!!
    }

private var _Ac_unit: ImageVector? = null

