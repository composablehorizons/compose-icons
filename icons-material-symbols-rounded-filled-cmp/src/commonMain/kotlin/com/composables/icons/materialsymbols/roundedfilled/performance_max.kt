package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Performance_max: ImageVector
    get() {
        if (_Performance_max != null) return _Performance_max!!
        
        _Performance_max = ImageVector.Builder(
            name = "performance_max",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(240f, -266f)
                lineToRelative(118f, 118f)
                quadToRelative(12f, 12f, 28f, 12f)
                reflectiveQuadToRelative(28f, -12f)
                lineToRelative(158f, -158f)
                quadToRelative(11f, -11f, 11f, -27.5f)
                reflectiveQuadTo(732f, 438f)
                quadToRelative(-12f, -12f, -28.5f, -12f)
                reflectiveQuadTo(675f, 438f)
                lineTo(546f, 567f)
                lineTo(428f, 449f)
                quadToRelative(-12f, -12f, -28f, -12f)
                reflectiveQuadToRelative(-28f, 12f)
                lineTo(228f, 593f)
                quadToRelative(-11f, 11f, -11f, 27.5f)
                reflectiveQuadToRelative(11f, 28.5f)
                quadToRelative(12f, 12f, 28.5f, 12f)
                reflectiveQuadToRelative(28.5f, -12f)
                lineToRelative(115f, -115f)
                close()
                moveToRelative(122f, -136f)
                lineToRelative(19f, 42f)
                quadToRelative(3f, 6f, 9f, 6f)
                reflectiveQuadToRelative(9f, -6f)
                lineToRelative(19f, -42f)
                lineToRelative(42f, -19f)
                quadToRelative(6f, -3f, 6f, -9f)
                reflectiveQuadToRelative(-6f, -9f)
                lineToRelative(-42f, -19f)
                lineToRelative(-19f, -42f)
                quadToRelative(-3f, -6f, -9f, -6f)
                reflectiveQuadToRelative(-9f, 6f)
                lineToRelative(-19f, 42f)
                lineToRelative(-42f, 19f)
                quadToRelative(-6f, 3f, -6f, 9f)
                reflectiveQuadToRelative(6f, 9f)
                lineToRelative(42f, 19f)
                close()
            }
        }.build()
        
        return _Performance_max!!
    }

private var _Performance_max: ImageVector? = null

