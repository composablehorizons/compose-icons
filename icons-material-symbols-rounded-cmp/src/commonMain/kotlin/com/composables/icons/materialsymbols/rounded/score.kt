package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Score: ImageVector
    get() {
        if (_Score != null) return _Score!!
        
        _Score = ImageVector.Builder(
            name = "score",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(320f, -180f)
                lineToRelative(240f, -240f)
                verticalLineToRelative(-220f)
                horizontalLineTo(200f)
                verticalLineToRelative(460f)
                lineToRelative(132f, -132f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(132f, 132f)
                close()
                moveToRelative(-10f, -180f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(480f, 450f)
                verticalLineToRelative(-180f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(510f, 240f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(540f, 270f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(510f, 480f)
                close()
                moveToRelative(98f, -120f)
                lineToRelative(51f, 76f)
                quadToRelative(9f, 14f, 1f, 29f)
                reflectiveQuadToRelative(-25f, 15f)
                quadToRelative(-7f, 0f, -13f, -3.5f)
                reflectiveQuadToRelative(-10f, -9.5f)
                lineToRelative(-72f, -107f)
                lineToRelative(72f, -107f)
                quadToRelative(4f, -6f, 10f, -9.5f)
                reflectiveQuadToRelative(13f, -3.5f)
                quadToRelative(17f, 0f, 25.5f, 15f)
                reflectiveQuadToRelative(-1.5f, 29f)
                lineToRelative(-51f, 76f)
                close()
                moveToRelative(-268f, 60f)
                horizontalLineToRelative(70f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(440f, 450f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(410f, 480f)
                horizontalLineTo(310f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(280f, 450f)
                verticalLineToRelative(-90f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(310f, 330f)
                horizontalLineToRelative(70f)
                verticalLineToRelative(-30f)
                horizontalLineToRelative(-70f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(280f, 270f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(310f, 240f)
                horizontalLineToRelative(100f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(440f, 270f)
                verticalLineToRelative(90f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(410f, 390f)
                horizontalLineToRelative(-70f)
                verticalLineToRelative(30f)
                close()
                moveToRelative(20f, 180f)
                lineTo(200f, 760f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-240f)
                lineTo(548f, 732f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineTo(360f, 600f)
                close()
                moveTo(200f, 760f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(560f)
                close()
            }
        }.build()
        
        return _Score!!
    }

private var _Score: ImageVector? = null

