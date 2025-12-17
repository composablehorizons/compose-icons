package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Open_with: ImageVector
    get() {
        if (_Open_with != null) return _Open_with!!
        
        _Open_with = ImageVector.Builder(
            name = "open_with",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                lineTo(310f, 710f)
                lineToRelative(57f, -57f)
                lineToRelative(73f, 73f)
                verticalLineToRelative(-166f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(165f)
                lineToRelative(72f, -73f)
                lineToRelative(58f, 58f)
                lineTo(480f, 880f)
                close()
                moveTo(250f, 650f)
                lineTo(80f, 480f)
                lineToRelative(169f, -169f)
                lineToRelative(57f, 57f)
                lineToRelative(-72f, 72f)
                horizontalLineToRelative(166f)
                verticalLineToRelative(80f)
                horizontalLineTo(235f)
                lineToRelative(73f, 72f)
                lineToRelative(-58f, 58f)
                close()
                moveToRelative(460f, 0f)
                lineToRelative(-57f, -57f)
                lineToRelative(73f, -73f)
                horizontalLineTo(560f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(165f)
                lineToRelative(-73f, -72f)
                lineToRelative(58f, -58f)
                lineToRelative(170f, 170f)
                lineToRelative(-170f, 170f)
                close()
                moveTo(440f, 400f)
                verticalLineToRelative(-166f)
                lineToRelative(-73f, 73f)
                lineToRelative(-57f, -57f)
                lineToRelative(170f, -170f)
                lineToRelative(170f, 170f)
                lineToRelative(-57f, 57f)
                lineToRelative(-73f, -73f)
                verticalLineToRelative(166f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Open_with!!
    }

private var _Open_with: ImageVector? = null

