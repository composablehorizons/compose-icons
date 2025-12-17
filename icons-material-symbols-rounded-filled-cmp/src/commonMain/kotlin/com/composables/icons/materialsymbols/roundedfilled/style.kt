package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Style: ImageVector
    get() {
        if (_Style != null) return _Style!!
        
        _Style = ImageVector.Builder(
            name = "style",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(159f, 792f)
                lineToRelative(-34f, -14f)
                quadToRelative(-31f, -13f, -41.5f, -45f)
                reflectiveQuadToRelative(3.5f, -63f)
                lineToRelative(72f, -156f)
                verticalLineToRelative(278f)
                close()
                moveToRelative(160f, 88f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(239f, 800f)
                verticalLineToRelative(-240f)
                lineToRelative(106f, 294f)
                quadToRelative(3f, 7f, 6f, 13.5f)
                reflectiveQuadToRelative(8f, 12.5f)
                horizontalLineToRelative(-40f)
                close()
                moveToRelative(206f, -4f)
                quadToRelative(-32f, 12f, -62f, -3f)
                reflectiveQuadToRelative(-42f, -47f)
                lineTo(243f, 338f)
                quadToRelative(-12f, -32f, 2f, -62.5f)
                reflectiveQuadToRelative(46f, -41.5f)
                lineToRelative(302f, -110f)
                quadToRelative(32f, -12f, 62f, 3f)
                reflectiveQuadToRelative(42f, 47f)
                lineToRelative(178f, 488f)
                quadToRelative(12f, 32f, -2f, 62.5f)
                reflectiveQuadTo(827f, 766f)
                lineTo(525f, 876f)
                close()
                moveToRelative(-86f, -476f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(479f, 360f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(439f, 320f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(399f, 360f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(439f, 400f)
                close()
            }
        }.build()
        
        return _Style!!
    }

private var _Style: ImageVector? = null

