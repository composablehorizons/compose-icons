package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Merge: ImageVector
    get() {
        if (_Merge != null) return _Merge!!
        
        _Merge = ImageVector.Builder(
            name = "merge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 616f)
                lineTo(284f, 812f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(228f, 812f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(165f, -166f)
                quadToRelative(23f, -23f, 35f, -52f)
                reflectiveQuadToRelative(12f, -61f)
                verticalLineToRelative(-204f)
                lineToRelative(-36f, 36f)
                quadToRelative(-11f, 11f, -27.5f, 11f)
                reflectiveQuadTo(348f, 308f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(104f, -104f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(104f, 104f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(612f, 308f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineToRelative(-36f, -35f)
                verticalLineToRelative(204f)
                quadToRelative(0f, 32f, 12f, 61f)
                reflectiveQuadToRelative(35f, 52f)
                lineToRelative(165f, 166f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(732f, 812f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(480f, 616f)
                close()
            }
        }.build()
        
        return _Merge!!
    }

private var _Merge: ImageVector? = null

