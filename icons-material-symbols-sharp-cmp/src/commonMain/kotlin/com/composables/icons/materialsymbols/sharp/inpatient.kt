package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Inpatient: ImageVector
    get() {
        if (_Inpatient != null) return _Inpatient!!
        
        _Inpatient = ImageVector.Builder(
            name = "inpatient",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(780f, 620f)
                lineTo(640f, 480f)
                lineToRelative(140f, -140f)
                lineToRelative(56f, 56f)
                lineToRelative(-43f, 44f)
                horizontalLineToRelative(127f)
                verticalLineToRelative(80f)
                horizontalLineTo(793f)
                lineToRelative(43f, 44f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(80f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(800f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -459f)
                quadToRelative(18f, -11f, 38f, -16f)
                reflectiveQuadToRelative(42f, -5f)
                horizontalLineToRelative(200f)
                quadToRelative(22f, 0f, 42f, 5f)
                reflectiveQuadToRelative(38f, 16f)
                verticalLineToRelative(-261f)
                horizontalLineTo(160f)
                verticalLineToRelative(261f)
                close()
                moveToRelative(180f, -61f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(260f, 280f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(340f, 200f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(420f, 280f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(340f, 360f)
                close()
                moveTo(160f, 800f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(440f, 480f)
                horizontalLineTo(240f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(160f, 560f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(140f, -40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(-140f, 40f)
                horizontalLineToRelative(360f)
                horizontalLineToRelative(-360f)
                close()
            }
        }.build()
        
        return _Inpatient!!
    }

private var _Inpatient: ImageVector? = null

