package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Snowmobile: ImageVector
    get() {
        if (_Snowmobile != null) return _Snowmobile!!
        
        _Snowmobile = ImageVector.Builder(
            name = "snowmobile",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 14f)
                horizontalLineToRelative(-6.7f)
                lineToRelative(-7.45f, -2.23f)
                lineToRelative(0.31f, -0.62f)
                lineTo(11.6f, 12f)
                lineToRelative(3.93f, -2.94f)
                curveToRelative(0f, 0f, 3.77f, 3.44f, 4.27f, 4.14f)
                curveTo(19.8f, 13.2f, 18.7f, 14f, 17f, 14f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(22f, 17f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-0.17f)
                lineToRelative(-2.2f, -2.2f)
                curveTo(20.58f, 15.37f, 22f, 14.4f, 22f, 13f)
                curveToRelative(0f, -1f, -8f, -8f, -8f, -8f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.25f)
                lineToRelative(0.8f, 0.72f)
                lineTo(11f, 10f)
                lineTo(2f, 9f)
                lineToRelative(-2f, 4f)
                lineToRelative(4.54f, 1.36f)
                lineToRelative(-3.49f, 1.88f)
                curveTo(-0.77f, 17.22f, -0.07f, 20f, 2f, 20f)
                horizontalLineToRelative(6f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                horizontalLineToRelative(4f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                horizontalLineTo(22f)
                close()
                moveTo(8f, 18f)
                horizontalLineTo(2f)
                lineToRelative(5.25f, -2.83f)
                lineTo(10f, 16f)
                curveTo(10f, 17.1f, 9.11f, 18f, 8f, 18f)
                close()
                moveTo(17f, 14f)
                horizontalLineToRelative(-6.7f)
                lineToRelative(-7.45f, -2.23f)
                lineToRelative(0.31f, -0.62f)
                lineTo(11.6f, 12f)
                lineToRelative(3.93f, -2.94f)
                curveToRelative(0f, 0f, 3.77f, 3.44f, 4.27f, 4.14f)
                curveTo(19.8f, 13.2f, 18.7f, 14f, 17f, 14f)
                close()
            }
        }.build()
        
        return _Snowmobile!!
    }

private var _Snowmobile: ImageVector? = null

