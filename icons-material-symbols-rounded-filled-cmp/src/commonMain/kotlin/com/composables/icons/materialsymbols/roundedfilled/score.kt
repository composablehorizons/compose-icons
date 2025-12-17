package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Score: ImageVector
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
                moveToRelative(560f, -320f)
                verticalLineToRelative(-100f)
                lineTo(520f, 660f)
                lineTo(388f, 528f)
                quadToRelative(-12f, -12f, -28f, -12f)
                reflectiveQuadToRelative(-28f, 12f)
                lineTo(200f, 660f)
                verticalLineToRelative(100f)
                lineToRelative(160f, -160f)
                lineToRelative(132f, 132f)
                quadToRelative(12f, 12f, 28f, 12f)
                reflectiveQuadToRelative(28f, -12f)
                lineToRelative(212f, -212f)
                close()
                moveToRelative(-250f, -40f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(540f, 450f)
                verticalLineToRelative(-180f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(510f, 240f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(480f, 270f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(510f, 480f)
                close()
                moveToRelative(98f, -120f)
                lineToRelative(51f, -76f)
                quadToRelative(10f, -14f, 1.5f, -29f)
                reflectiveQuadTo(635f, 240f)
                quadToRelative(-7f, 0f, -13f, 3.5f)
                reflectiveQuadToRelative(-10f, 9.5f)
                lineToRelative(-72f, 107f)
                lineToRelative(72f, 107f)
                quadToRelative(4f, 6f, 10f, 9.5f)
                reflectiveQuadToRelative(13f, 3.5f)
                quadToRelative(17f, 0f, 25f, -15f)
                reflectiveQuadToRelative(-1f, -29f)
                lineToRelative(-51f, -76f)
                close()
                moveToRelative(-268f, 60f)
                verticalLineToRelative(-30f)
                horizontalLineToRelative(70f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(440f, 360f)
                verticalLineToRelative(-90f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(410f, 240f)
                horizontalLineTo(310f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(280f, 270f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(310f, 300f)
                horizontalLineToRelative(70f)
                verticalLineToRelative(30f)
                horizontalLineToRelative(-70f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(280f, 360f)
                verticalLineToRelative(90f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(310f, 480f)
                horizontalLineToRelative(100f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(440f, 450f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(410f, 420f)
                horizontalLineToRelative(-70f)
                close()
            }
        }.build()
        
        return _Score!!
    }

private var _Score: ImageVector? = null

