package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.CreativeCommonsNcJp: ImageVector
    get() {
        if (_CreativeCommonsNcJp != null) return _CreativeCommonsNcJp!!
        
        _CreativeCommonsNcJp = ImageVector.Builder(
            name = "creative-commons-nc-jp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(247.7f, 8f)
                curveTo(103.6f, 8f, 0f, 124.8f, 0f, 256f)
                curveToRelative(0f, 136.4f, 111.8f, 248f, 247.7f, 248f)
                curveTo(377.9f, 504f, 496f, 403.2f, 496f, 256f)
                curveTo(496f, 117.2f, 388.5f, 8f, 247.7f, 8f)
                close()
                moveToRelative(0.6f, 450.7f)
                curveToRelative(-112f, 0f, -203.6f, -92.5f, -203.6f, -202.7f)
                curveToRelative(0f, -21.1f, 3f, -41.2f, 9f, -60.3f)
                lineToRelative(127f, 56.5f)
                horizontalLineToRelative(-27.9f)
                verticalLineToRelative(38.6f)
                horizontalLineToRelative(58.1f)
                lineToRelative(5.7f, 11.8f)
                verticalLineToRelative(18.7f)
                horizontalLineToRelative(-63.8f)
                verticalLineTo(360f)
                horizontalLineToRelative(63.8f)
                verticalLineToRelative(56f)
                horizontalLineToRelative(61.7f)
                verticalLineToRelative(-56f)
                horizontalLineToRelative(64.2f)
                verticalLineToRelative(-35.7f)
                lineToRelative(81f, 36.1f)
                curveToRelative(-1.5f, 2.2f, -57.1f, 98.3f, -175.2f, 98.3f)
                close()
                moveToRelative(87.6f, -137.3f)
                horizontalLineToRelative(-57.6f)
                verticalLineToRelative(-18.7f)
                lineToRelative(2.9f, -5.6f)
                lineToRelative(54.7f, 24.3f)
                close()
                moveToRelative(6.5f, -51.4f)
                verticalLineToRelative(-17.8f)
                horizontalLineToRelative(-38.6f)
                lineToRelative(63f, -116f)
                horizontalLineTo(301f)
                lineToRelative(-43.4f, 96f)
                lineToRelative(-23f, -10.2f)
                lineToRelative(-39.6f, -85.7f)
                horizontalLineToRelative(-65.8f)
                lineToRelative(27.3f, 51f)
                lineToRelative(-81.9f, -36.5f)
                curveToRelative(27.8f, -44.1f, 82.6f, -98.1f, 173.7f, -98.1f)
                curveToRelative(112.8f, 0f, 203f, 90f, 203f, 203.4f)
                curveToRelative(0f, 21f, -2.7f, 40.6f, -7.9f, 59f)
                lineToRelative(-101f, -45.1f)
                close()
            }
        }.build()
        
        return _CreativeCommonsNcJp!!
    }

private var _CreativeCommonsNcJp: ImageVector? = null

