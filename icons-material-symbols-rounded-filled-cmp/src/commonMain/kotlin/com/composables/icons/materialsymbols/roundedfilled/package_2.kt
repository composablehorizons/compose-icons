package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Package_2: ImageVector
    get() {
        if (_Package_2 != null) return _Package_2!!
        
        _Package_2 = ImageVector.Builder(
            name = "package_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 869f)
                verticalLineToRelative(-366f)
                lineTo(120f, 318f)
                verticalLineToRelative(321f)
                quadToRelative(0f, 22f, 10.5f, 40f)
                reflectiveQuadToRelative(29.5f, 29f)
                lineTo(440f, 869f)
                close()
                moveToRelative(80f, 0f)
                lineToRelative(280f, -161f)
                quadToRelative(19f, -11f, 29.5f, -29f)
                reflectiveQuadToRelative(10.5f, -40f)
                verticalLineToRelative(-321f)
                lineTo(520f, 503f)
                verticalLineToRelative(366f)
                close()
                moveToRelative(159f, -550f)
                lineToRelative(118f, -69f)
                lineToRelative(-277f, -159f)
                quadToRelative(-19f, -11f, -40f, -11f)
                reflectiveQuadToRelative(-40f, 11f)
                lineToRelative(-79f, 45f)
                lineToRelative(318f, 183f)
                close()
                moveTo(480f, 434f)
                lineToRelative(119f, -68f)
                lineToRelative(-317f, -184f)
                lineToRelative(-120f, 69f)
                lineToRelative(318f, 183f)
                close()
            }
        }.build()
        
        return _Package_2!!
    }

private var _Package_2: ImageVector? = null

