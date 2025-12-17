package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Rev: ImageVector
    get() {
        if (_Rev != null) return _Rev!!
        
        _Rev = ImageVector.Builder(
            name = "rev",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(289.67f, 274.89f)
                arcToRelative(65.57f, 65.57f, 0f, true, true, -65.56f, -65.56f)
                arcToRelative(65.64f, 65.64f, 0f, false, true, 65.56f, 65.56f)
                close()
                moveToRelative(139.55f, -5.05f)
                horizontalLineToRelative(-0.13f)
                arcToRelative(204.69f, 204.69f, 0f, false, false, -74.32f, -153f)
                lineToRelative(-45.38f, 26.2f)
                arcToRelative(157.07f, 157.07f, 0f, false, true, 71.81f, 131.84f)
                curveTo(381.2f, 361.5f, 310.73f, 432f, 224.11f, 432f)
                reflectiveCurveTo(67f, 361.5f, 67f, 274.88f)
                curveToRelative(0f, -81.88f, 63f, -149.27f, 143f, -156.43f)
                verticalLineToRelative(39.12f)
                lineToRelative(108.77f, -62.79f)
                lineTo(210f, 32f)
                verticalLineToRelative(38.32f)
                curveToRelative(-106.7f, 7.25f, -191f, 96f, -191f, 204.57f)
                curveToRelative(0f, 111.59f, 89.12f, 202.29f, 200.06f, 205f)
                verticalLineToRelative(0.11f)
                horizontalLineToRelative(210.16f)
                verticalLineTo(269.84f)
                close()
            }
        }.build()
        
        return _Rev!!
    }

private var _Rev: ImageVector? = null

