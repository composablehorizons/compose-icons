package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Data_thresholding: ImageVector
    get() {
        if (_Data_thresholding != null) return _Data_thresholding!!
        
        _Data_thresholding = ImageVector.Builder(
            name = "data_thresholding",
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
                moveToRelative(406f, -80f)
                horizontalLineToRelative(85f)
                lineToRelative(69f, -69f)
                verticalLineToRelative(-51f)
                horizontalLineToRelative(-34f)
                lineTo(606f, 760f)
                close()
                moveTo(306f, 560f)
                lineToRelative(121f, -120f)
                lineToRelative(80f, 80f)
                lineToRelative(203f, -204f)
                lineToRelative(-56f, -56f)
                lineToRelative(-147f, 147f)
                lineToRelative(-80f, -80f)
                lineToRelative(-177f, 177f)
                lineToRelative(56f, 56f)
                close()
                moveTo(200f, 760f)
                horizontalLineToRelative(34f)
                lineToRelative(120f, -120f)
                horizontalLineToRelative(-85f)
                lineToRelative(-69f, 69f)
                verticalLineToRelative(51f)
                close()
                moveToRelative(341f, 0f)
                lineToRelative(120f, -120f)
                horizontalLineToRelative(-85f)
                lineTo(456f, 760f)
                horizontalLineToRelative(85f)
                close()
                moveToRelative(-149f, 0f)
                lineToRelative(120f, -120f)
                horizontalLineToRelative(-85f)
                lineTo(307f, 760f)
                horizontalLineToRelative(85f)
                close()
            }
        }.build()
        
        return _Data_thresholding!!
    }

private var _Data_thresholding: ImageVector? = null

