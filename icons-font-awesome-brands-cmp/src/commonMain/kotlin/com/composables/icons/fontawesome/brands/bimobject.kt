package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Bimobject: ImageVector
    get() {
        if (_Bimobject != null) return _Bimobject!!
        
        _Bimobject = ImageVector.Builder(
            name = "bimobject",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(416f, 32f)
                horizontalLineTo(32f)
                curveTo(14.4f, 32f, 0f, 46.4f, 0f, 64f)
                verticalLineToRelative(384f)
                curveToRelative(0f, 17.6f, 14.4f, 32f, 32f, 32f)
                horizontalLineToRelative(384f)
                curveToRelative(17.6f, 0f, 32f, -14.4f, 32f, -32f)
                verticalLineTo(64f)
                curveToRelative(0f, -17.6f, -14.4f, -32f, -32f, -32f)
                close()
                moveToRelative(-64f, 257.4f)
                curveToRelative(0f, 49.4f, -11.4f, 82.6f, -103.8f, 82.6f)
                horizontalLineToRelative(-16.9f)
                curveToRelative(-44.1f, 0f, -62.4f, -14.9f, -70.4f, -38.8f)
                horizontalLineToRelative(-0.9f)
                verticalLineTo(368f)
                horizontalLineTo(96f)
                verticalLineTo(136f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(74.7f)
                horizontalLineToRelative(1.1f)
                curveToRelative(4.6f, -30.5f, 39.7f, -38.8f, 69.7f, -38.8f)
                horizontalLineToRelative(17.3f)
                curveToRelative(92.4f, 0f, 103.8f, 33.1f, 103.8f, 82.5f)
                verticalLineToRelative(35f)
                close()
                moveToRelative(-64f, -28.9f)
                verticalLineToRelative(22.9f)
                curveToRelative(0f, 21.7f, -3.4f, 33.8f, -38.4f, 33.8f)
                horizontalLineToRelative(-45.3f)
                curveToRelative(-28.9f, 0f, -44.1f, -6.5f, -44.1f, -35.7f)
                verticalLineToRelative(-19f)
                curveToRelative(0f, -29.3f, 15.2f, -35.7f, 44.1f, -35.7f)
                horizontalLineToRelative(45.3f)
                curveToRelative(35f, -0.2f, 38.4f, 12f, 38.4f, 33.7f)
                close()
            }
        }.build()
        
        return _Bimobject!!
    }

private var _Bimobject: ImageVector? = null

