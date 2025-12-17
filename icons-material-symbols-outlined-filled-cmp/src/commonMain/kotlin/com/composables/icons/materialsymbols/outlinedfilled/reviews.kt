package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Reviews: ImageVector
    get() {
        if (_Reviews != null) return _Reviews!!
        
        _Reviews = ImageVector.Builder(
            name = "reviews",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                verticalLineToRelative(-720f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 80f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 720f)
                horizontalLineTo(240f)
                lineTo(80f, 880f)
                close()
                moveToRelative(283f, -310f)
                lineToRelative(117f, -71f)
                lineToRelative(117f, 71f)
                lineToRelative(-31f, -133f)
                lineToRelative(104f, -90f)
                lineToRelative(-137f, -11f)
                lineToRelative(-53f, -126f)
                lineToRelative(-53f, 126f)
                lineToRelative(-137f, 11f)
                lineToRelative(104f, 90f)
                lineToRelative(-31f, 133f)
                close()
            }
        }.build()
        
        return _Reviews!!
    }

private var _Reviews: ImageVector? = null

