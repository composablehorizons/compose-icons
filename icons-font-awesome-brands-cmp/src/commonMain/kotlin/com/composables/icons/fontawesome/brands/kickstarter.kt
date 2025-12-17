package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Kickstarter: ImageVector
    get() {
        if (_Kickstarter != null) return _Kickstarter!!
        
        _Kickstarter = ImageVector.Builder(
            name = "kickstarter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 480f)
                horizontalLineTo(48f)
                curveToRelative(-26.4f, 0f, -48f, -21.6f, -48f, -48f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.4f, 21.6f, -48f, 48f, -48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.4f, 0f, 48f, 21.6f, 48f, 48f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.4f, -21.6f, 48f, -48f, 48f)
                close()
                moveTo(199.6f, 178.5f)
                curveToRelative(0f, -30.7f, -17.6f, -45.1f, -39.7f, -45.1f)
                curveToRelative(-25.8f, 0f, -40f, 19.8f, -40f, 44.5f)
                verticalLineToRelative(154.8f)
                curveToRelative(0f, 25.8f, 13.7f, 45.6f, 40.5f, 45.6f)
                curveToRelative(21.5f, 0f, 39.2f, -14f, 39.2f, -45.6f)
                verticalLineToRelative(-41.8f)
                lineToRelative(60.6f, 75.7f)
                curveToRelative(12.3f, 14.9f, 39f, 16.8f, 55.8f, 0f)
                curveToRelative(14.6f, -15.1f, 14.8f, -36.8f, 4f, -50.4f)
                lineToRelative(-49.1f, -62.8f)
                lineToRelative(40.5f, -58.7f)
                curveToRelative(9.4f, -13.5f, 9.5f, -34.5f, -5.6f, -49.1f)
                curveToRelative(-16.4f, -15.9f, -44.6f, -17.3f, -61.4f, 7f)
                lineToRelative(-44.8f, 64.7f)
                verticalLineToRelative(-38.8f)
                close()
            }
        }.build()
        
        return _Kickstarter!!
    }

private var _Kickstarter: ImageVector? = null

