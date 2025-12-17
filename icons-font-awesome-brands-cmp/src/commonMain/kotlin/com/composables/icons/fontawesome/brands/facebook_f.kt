package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.FacebookF: ImageVector
    get() {
        if (_FacebookF != null) return _FacebookF!!
        
        _FacebookF = ImageVector.Builder(
            name = "facebook-f",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 320f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(279.14f, 288f)
                lineToRelative(14.22f, -92.66f)
                horizontalLineToRelative(-88.91f)
                verticalLineToRelative(-60.13f)
                curveToRelative(0f, -25.35f, 12.42f, -50.06f, 52.24f, -50.06f)
                horizontalLineToRelative(40.42f)
                verticalLineTo(6.26f)
                reflectiveCurveTo(260.43f, 0f, 225.36f, 0f)
                curveToRelative(-73.22f, 0f, -121.08f, 44.38f, -121.08f, 124.72f)
                verticalLineToRelative(70.62f)
                horizontalLineTo(22.89f)
                verticalLineTo(288f)
                horizontalLineToRelative(81.39f)
                verticalLineToRelative(224f)
                horizontalLineToRelative(100.17f)
                verticalLineTo(288f)
                close()
            }
        }.build()
        
        return _FacebookF!!
    }

private var _FacebookF: ImageVector? = null

