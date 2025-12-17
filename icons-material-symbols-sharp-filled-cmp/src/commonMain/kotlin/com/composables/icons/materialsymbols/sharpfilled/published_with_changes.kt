package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Published_with_changes: ImageVector
    get() {
        if (_Published_with_changes != null) return _Published_with_changes!!
        
        _Published_with_changes = ImageVector.Builder(
            name = "published_with_changes",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 878f)
                quadToRelative(-76f, -8f, -141.5f, -41.5f)
                reflectiveQuadToRelative(-114f, -87f)
                quadTo(136f, 696f, 108f, 627f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -91f, 36.5f, -168f)
                reflectiveQuadTo(216f, 180f)
                horizontalLineToRelative(-96f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-109f)
                quadToRelative(-55f, 44f, -87.5f, 108.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 123f, 80.5f, 212.5f)
                reflectiveQuadTo(440f, 797f)
                verticalLineToRelative(81f)
                close()
                moveToRelative(-17f, -214f)
                lineTo(254f, 494f)
                lineToRelative(56f, -56f)
                lineToRelative(113f, 113f)
                lineToRelative(227f, -227f)
                lineToRelative(56f, 57f)
                lineToRelative(-283f, 283f)
                close()
                moveToRelative(177f, 196f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(109f)
                quadToRelative(55f, -45f, 87.5f, -109f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, -123f, -80.5f, -212.5f)
                reflectiveQuadTo(520f, 163f)
                verticalLineToRelative(-81f)
                quadToRelative(152f, 15f, 256f, 128f)
                reflectiveQuadToRelative(104f, 270f)
                quadToRelative(0f, 91f, -36.5f, 168f)
                reflectiveQuadTo(744f, 780f)
                horizontalLineToRelative(96f)
                verticalLineToRelative(80f)
                horizontalLineTo(600f)
                close()
            }
        }.build()
        
        return _Published_with_changes!!
    }

private var _Published_with_changes: ImageVector? = null

