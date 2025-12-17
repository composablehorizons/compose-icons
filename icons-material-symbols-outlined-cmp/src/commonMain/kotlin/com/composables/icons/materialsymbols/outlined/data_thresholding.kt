package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Data_thresholding: ImageVector
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
                moveToRelative(491f, -80f)
                horizontalLineToRelative(69f)
                verticalLineToRelative(-69f)
                lineToRelative(-69f, 69f)
                close()
                moveToRelative(-457f, 0f)
                horizontalLineToRelative(73f)
                lineToRelative(120f, -120f)
                horizontalLineToRelative(85f)
                lineTo(392f, 760f)
                horizontalLineToRelative(64f)
                lineToRelative(120f, -120f)
                horizontalLineToRelative(85f)
                lineTo(541f, 760f)
                horizontalLineToRelative(65f)
                lineToRelative(120f, -120f)
                horizontalLineToRelative(34f)
                verticalLineToRelative(-440f)
                horizontalLineTo(200f)
                verticalLineToRelative(509f)
                lineToRelative(69f, -69f)
                horizontalLineToRelative(85f)
                lineTo(234f, 760f)
                close()
                moveToRelative(72f, -200f)
                lineToRelative(-56f, -56f)
                lineToRelative(177f, -177f)
                lineToRelative(80f, 80f)
                lineToRelative(147f, -147f)
                lineToRelative(56f, 56f)
                lineToRelative(-203f, 204f)
                lineToRelative(-80f, -80f)
                lineToRelative(-121f, 120f)
                close()
                moveTo(200f, 760f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(560f)
                close()
            }
        }.build()
        
        return _Data_thresholding!!
    }

private var _Data_thresholding: ImageVector? = null

