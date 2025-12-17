package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Cheer: ImageVector
    get() {
        if (_Cheer != null) return _Cheer!!
        
        _Cheer = ImageVector.Builder(
            name = "cheer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(312f, 209f)
                lineToRelative(-40f, -120f)
                lineToRelative(56f, -18f)
                lineToRelative(40f, 119f)
                lineToRelative(-56f, 19f)
                close()
                moveToRelative(138f, -49f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(198f, 49f)
                lineToRelative(-56f, -19f)
                lineToRelative(40f, -119f)
                lineToRelative(56f, 19f)
                lineToRelative(-40f, 119f)
                close()
                moveTo(875f, 920f)
                lineTo(664f, 888f)
                quadToRelative(-34f, -5f, -59.5f, -27.5f)
                reflectiveQuadTo(568f, 806f)
                lineToRelative(-34f, -106f)
                quadToRelative(-11f, -35f, -1f, -69.5f)
                reflectiveQuadToRelative(36f, -57.5f)
                lineToRelative(55f, 170f)
                lineToRelative(36f, -11f)
                lineToRelative(-88f, -278f)
                quadToRelative(-13f, -41f, 2.5f, -80.5f)
                reflectiveQuadTo(627f, 313f)
                lineToRelative(50f, -28f)
                lineToRelative(177f, 334f)
                quadToRelative(5f, 10f, 14.5f, 15.5f)
                reflectiveQuadTo(889f, 640f)
                horizontalLineToRelative(29f)
                lineTo(875f, 920f)
                close()
                moveTo(86f, 920f)
                lineTo(43f, 640f)
                horizontalLineToRelative(29f)
                quadToRelative(11f, 0f, 20.5f, -5.5f)
                reflectiveQuadTo(107f, 619f)
                lineToRelative(177f, -334f)
                lineToRelative(50f, 28f)
                quadToRelative(37f, 21f, 52.5f, 60.5f)
                reflectiveQuadTo(389f, 454f)
                lineToRelative(-89f, 278f)
                lineToRelative(36f, 11f)
                lineToRelative(55f, -171f)
                quadToRelative(27f, 23f, 37f, 58f)
                reflectiveQuadToRelative(-1f, 70f)
                lineToRelative(-34f, 106f)
                quadToRelative(-11f, 32f, -36.5f, 54.5f)
                reflectiveQuadTo(297f, 888f)
                lineTo(86f, 920f)
                close()
            }
        }.build()
        
        return _Cheer!!
    }

private var _Cheer: ImageVector? = null

