package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Private_connectivity: ImageVector
    get() {
        if (_Private_connectivity != null) return _Private_connectivity!!
        
        _Private_connectivity = ImageVector.Builder(
            name = "private_connectivity",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 760f)
                quadToRelative(-106f, 0f, -184.5f, -68.5f)
                reflectiveQuadTo(203f, 520f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(123f)
                quadToRelative(14f, -103f, 92.5f, -171.5f)
                reflectiveQuadTo(480f, 200f)
                quadToRelative(106f, 0f, 184.5f, 68.5f)
                reflectiveQuadTo(757f, 440f)
                horizontalLineToRelative(123f)
                verticalLineToRelative(80f)
                horizontalLineTo(757f)
                quadToRelative(-14f, 103f, -92.5f, 171.5f)
                reflectiveQuadTo(480f, 760f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(83f, 0f, 141.5f, -58.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-83f, 0f, -141.5f, 58.5f)
                reflectiveQuadTo(280f, 480f)
                quadToRelative(0f, 83f, 58.5f, 141.5f)
                reflectiveQuadTo(480f, 680f)
                close()
                moveToRelative(-80f, -60f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(600f, 580f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(560f, 420f)
                verticalLineToRelative(-36f)
                quadToRelative(0f, -35f, -23f, -59.5f)
                reflectiveQuadTo(480f, 300f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 380f)
                verticalLineToRelative(40f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(360f, 460f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(400f, 620f)
                close()
                moveToRelative(80f, -70f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(450f, 520f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(480f, 490f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(510f, 520f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(480f, 550f)
                close()
                moveToRelative(-40f, -130f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 340f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 380f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(40f, 100f)
                close()
            }
        }.build()
        
        return _Private_connectivity!!
    }

private var _Private_connectivity: ImageVector? = null

