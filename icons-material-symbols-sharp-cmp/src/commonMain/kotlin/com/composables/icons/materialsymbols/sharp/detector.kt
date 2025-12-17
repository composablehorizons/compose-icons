package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Detector: ImageVector
    get() {
        if (_Detector != null) return _Detector!!
        
        _Detector = ImageVector.Builder(
            name = "detector",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 840f)
                quadToRelative(-88f, 0f, -168.5f, -33f)
                reflectiveQuadTo(169f, 711f)
                lineToRelative(57f, -57f)
                quadToRelative(51f, 51f, 117f, 78.5f)
                reflectiveQuadTo(481f, 760f)
                quadToRelative(72f, 0f, 137.5f, -27f)
                reflectiveQuadTo(735f, 655f)
                lineToRelative(56f, 56f)
                quadToRelative(-63f, 63f, -143f, 96f)
                reflectiveQuadToRelative(-168f, 33f)
                close()
                moveToRelative(0f, -160f)
                quadToRelative(-56f, 0f, -107f, -21f)
                reflectiveQuadToRelative(-91f, -61f)
                lineToRelative(56f, -56f)
                quadToRelative(29f, 29f, 65.5f, 43.5f)
                reflectiveQuadTo(480f, 600f)
                quadToRelative(40f, 0f, 76.5f, -14.5f)
                reflectiveQuadTo(622f, 542f)
                lineToRelative(56f, 56f)
                quadToRelative(-40f, 40f, -91f, 61f)
                reflectiveQuadToRelative(-107f, 21f)
                close()
                moveTo(200f, 200f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-40f)
                horizontalLineTo(200f)
                close()
                moveToRelative(124f, 120f)
                lineToRelative(12f, 40f)
                horizontalLineToRelative(288f)
                lineToRelative(12f, -40f)
                horizontalLineTo(324f)
                close()
                moveToRelative(-46f, 120f)
                lineToRelative(-38f, -120f)
                horizontalLineTo(120f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(200f)
                horizontalLineTo(720f)
                lineToRelative(-46f, 120f)
                horizontalLineTo(278f)
                close()
                moveToRelative(-78f, -240f)
                verticalLineToRelative(40f)
                verticalLineToRelative(-40f)
                close()
            }
        }.build()
        
        return _Detector!!
    }

private var _Detector: ImageVector? = null

