package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Sick: ImageVector
    get() {
        if (_Sick != null) return _Sick!!
        
        _Sick = ImageVector.Builder(
            name = "sick",
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
                moveTo(21f, 9f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                curveToRelative(0f, -1.1f, 2f, -4f, 2f, -4f)
                reflectiveCurveToRelative(2f, 2.9f, 2f, 4f)
                curveTo(23f, 8.1f, 22.1f, 9f, 21f, 9f)
                close()
                moveTo(17.5f, 7f)
                curveToRelative(0f, -0.73f, 0.41f, -1.71f, 0.92f, -2.66f)
                curveTo(16.68f, 2.88f, 14.44f, 2f, 11.99f, 2f)
                curveTo(6.47f, 2f, 2f, 6.48f, 2f, 12f)
                curveToRelative(0f, 5.52f, 4.47f, 10f, 9.99f, 10f)
                curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                curveToRelative(0f, -0.55f, -0.06f, -1.09f, -0.14f, -1.62f)
                curveTo(21.58f, 10.45f, 21.3f, 10.5f, 21f, 10.5f)
                curveTo(19.07f, 10.5f, 17.5f, 8.93f, 17.5f, 7f)
                close()
                moveTo(15.62f, 7.38f)
                lineToRelative(1.06f, 1.06f)
                lineTo(15.62f, 9.5f)
                lineToRelative(1.06f, 1.06f)
                lineToRelative(-1.06f, 1.06f)
                lineTo(13.5f, 9.5f)
                lineTo(15.62f, 7.38f)
                close()
                moveTo(7.32f, 8.44f)
                lineToRelative(1.06f, -1.06f)
                lineTo(10.5f, 9.5f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-1.06f, -1.06f)
                lineTo(8.38f, 9.5f)
                lineTo(7.32f, 8.44f)
                close()
                moveTo(15.44f, 17f)
                curveToRelative(-0.69f, -1.19f, -1.97f, -2f, -3.44f, -2f)
                reflectiveCurveToRelative(-2.75f, 0.81f, -3.44f, 2f)
                horizontalLineTo(6.88f)
                curveToRelative(0.3f, -0.76f, 0.76f, -1.43f, 1.34f, -1.99f)
                lineTo(5.24f, 13.3f)
                curveToRelative(-0.45f, 0.26f, -1.01f, 0.28f, -1.49f, 0f)
                curveToRelative(-0.72f, -0.41f, -0.96f, -1.33f, -0.55f, -2.05f)
                curveToRelative(0.41f, -0.72f, 1.33f, -0.96f, 2.05f, -0.55f)
                curveToRelative(0.48f, 0.28f, 0.74f, 0.78f, 0.74f, 1.29f)
                lineToRelative(3.58f, 2.07f)
                curveToRelative(0.73f, -0.36f, 1.55f, -0.56f, 2.43f, -0.56f)
                curveToRelative(2.33f, 0f, 4.32f, 1.45f, 5.12f, 3.5f)
                horizontalLineTo(15.44f)
                close()
            }
        }.build()
        
        return _Sick!!
    }

private var _Sick: ImageVector? = null

