package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Cloud_download: ImageVector
    get() {
        if (_Cloud_download != null) return _Cloud_download!!
        
        _Cloud_download = ImageVector.Builder(
            name = "cloud_download",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(260f, 800f)
                quadToRelative(-91f, 0f, -155.5f, -63f)
                reflectiveQuadTo(40f, 583f)
                quadToRelative(0f, -78f, 47f, -139f)
                reflectiveQuadToRelative(123f, -78f)
                quadToRelative(23f, -81f, 85.5f, -136f)
                reflectiveQuadTo(440f, 163f)
                verticalLineToRelative(323f)
                lineToRelative(-64f, -62f)
                lineToRelative(-56f, 56f)
                lineToRelative(160f, 160f)
                lineToRelative(160f, -160f)
                lineToRelative(-56f, -56f)
                lineToRelative(-64f, 62f)
                verticalLineToRelative(-323f)
                quadToRelative(103f, 14f, 171.5f, 92.5f)
                reflectiveQuadTo(760f, 440f)
                quadToRelative(69f, 8f, 114.5f, 59.5f)
                reflectiveQuadTo(920f, 620f)
                quadToRelative(0f, 75f, -52.5f, 127.5f)
                reflectiveQuadTo(740f, 800f)
                horizontalLineTo(260f)
                close()
            }
        }.build()
        
        return _Cloud_download!!
    }

private var _Cloud_download: ImageVector? = null

