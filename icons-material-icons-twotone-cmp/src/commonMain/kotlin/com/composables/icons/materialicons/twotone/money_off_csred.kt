package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Money_off_csred: ImageVector
    get() {
        if (_Money_off_csred != null) return _Money_off_csred!!
        
        _Money_off_csred = ImageVector.Builder(
            name = "money_off_csred",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.5f, 6.9f)
                curveToRelative(1.78f, 0f, 2.44f, 0.85f, 2.5f, 2.1f)
                horizontalLineToRelative(2.21f)
                curveToRelative(-0.07f, -1.72f, -1.12f, -3.3f, -3.21f, -3.81f)
                verticalLineTo(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2.16f)
                curveToRelative(-0.39f, 0.08f, -0.75f, 0.21f, -1.1f, 0.36f)
                lineToRelative(1.51f, 1.51f)
                curveToRelative(0.32f, -0.08f, 0.69f, -0.13f, 1.09f, -0.13f)
                close()
                moveTo(5.47f, 3.92f)
                lineTo(4.06f, 5.33f)
                lineTo(7.5f, 8.77f)
                curveToRelative(0f, 2.08f, 1.56f, 3.22f, 3.91f, 3.91f)
                lineToRelative(3.51f, 3.51f)
                curveToRelative(-0.34f, 0.49f, -1.05f, 0.91f, -2.42f, 0.91f)
                curveToRelative(-2.06f, 0f, -2.87f, -0.92f, -2.98f, -2.1f)
                horizontalLineToRelative(-2.2f)
                curveToRelative(0.12f, 2.19f, 1.76f, 3.42f, 3.68f, 3.83f)
                verticalLineTo(21f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.15f)
                curveToRelative(0.96f, -0.18f, 1.83f, -0.55f, 2.46f, -1.12f)
                lineToRelative(2.22f, 2.22f)
                lineToRelative(1.41f, -1.41f)
                lineTo(5.47f, 3.92f)
                close()
            }
        }.build()
        
        return _Money_off_csred!!
    }

private var _Money_off_csred: ImageVector? = null

