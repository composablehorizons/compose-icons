package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Sdk: ImageVector
    get() {
        if (_Sdk != null) return _Sdk!!
        
        _Sdk = ImageVector.Builder(
            name = "sdk",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-608f)
                lineToRelative(92f, -112f)
                horizontalLineToRelative(536f)
                lineToRelative(92f, 112f)
                verticalLineToRelative(608f)
                horizontalLineTo(120f)
                close()
                moveToRelative(96f, -600f)
                horizontalLineToRelative(528f)
                lineToRelative(-34f, -40f)
                horizontalLineTo(250f)
                lineToRelative(-34f, 40f)
                close()
                moveToRelative(-16f, 520f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-440f)
                horizontalLineTo(200f)
                verticalLineToRelative(440f)
                close()
                moveToRelative(408f, -220f)
                lineToRelative(-84f, 84f)
                lineToRelative(58f, 58f)
                lineToRelative(142f, -142f)
                lineToRelative(-142f, -142f)
                lineToRelative(-58f, 58f)
                lineToRelative(84f, 84f)
                close()
                moveToRelative(-254f, 0f)
                lineToRelative(84f, -84f)
                lineToRelative(-58f, -58f)
                lineToRelative(-142f, 142f)
                lineToRelative(142f, 142f)
                lineToRelative(58f, -58f)
                lineToRelative(-84f, -84f)
                close()
                moveTo(200f, 760f)
                verticalLineToRelative(-440f)
                verticalLineToRelative(440f)
                close()
            }
        }.build()
        
        return _Sdk!!
    }

private var _Sdk: ImageVector? = null

